package com.julianjupiter.springmvcgreetings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.lang.System.Logger;

@Controller
public class GreetingsController {

    private static final Logger LOGGER = System.getLogger(GreetingsController.class.getName());

    @RequestMapping(value = {"/greetings"}, method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model) {
        LOGGER.log(Logger.Level.INFO, "URL: " + request.getRequestURL().toString());

        model.addAttribute("pageTitle", "Greetings");
        model.addAttribute("messageTitle", "Hello world!");
        model.addAttribute("messageBody", "Hello world! Welcome to Spring MVC!");

        return "greetings/index";
    }

}
