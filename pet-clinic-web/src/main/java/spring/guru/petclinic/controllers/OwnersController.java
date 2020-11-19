package spring.guru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnersController {

    @RequestMapping({"","/","/index","/index.html"})
    private String index(){
        return "owners/index";
    }
}
