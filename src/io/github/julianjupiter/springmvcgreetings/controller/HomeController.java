package io.github.julianjupiter.springmvcgreetings.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingsController.class);

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String index(ModelMap model, HttpServletRequest request) {
        LOGGER.info(request.getRequestURL().toString());

        model.addAttribute("pageTitle", "Home");
        model.addAttribute("messageTitle", "Spring MVC Greetings Application");
        model.addAttribute("messageBody", "Welcome to Spring MVC Greetings Application!");

        return "home/index";
    }
}
