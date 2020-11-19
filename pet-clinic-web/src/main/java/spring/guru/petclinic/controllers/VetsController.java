package spring.guru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetsController {

    @RequestMapping({"/","/index","/index.html"})
    private String index(){
        return "vets/index";
    }
}
