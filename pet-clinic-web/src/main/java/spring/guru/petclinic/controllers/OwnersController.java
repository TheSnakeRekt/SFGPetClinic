package spring.guru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.guru.petclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnersController {


    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    private String index(Model model){
        model.addAttribute("ownersList", ownerService.findAll());
        return "owners/index";
    }
}
