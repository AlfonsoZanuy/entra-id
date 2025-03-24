package mx.ucq.estudio.entraid.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final Logger log = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("")
    public String index(Model model, Authentication user) {
        log.info("GET /: user={}", user);
        log.info("GET /: user={}");
        System.out.println(user);
        System.out.println("inicio");
        System.out.println(user.getName());
        System.out.println(user.getAuthorities());
        System.out.println("Fin");
        model.addAttribute("user", user);
        return "index";
    }
    @GetMapping("/index")
    public String index2(Model model, Authentication user) {
        log.info("GET /: user={}", user);
        System.out.println(user);
        System.out.println("inicio");
        System.out.println(user.getName());
        System.out.println(user.getAuthorities());
        System.out.println("Fin");
        model.addAttribute("user", user);
        return "index";
    }
}