package io.github.julianjupiter.springmvcgreetings.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public class BaseController {

    @ModelAttribute
    public void addingCommonObjects(Model model) {
        model.addAttribute("applicationTitle", "Spring MVC Greetings Application");
    }

}
