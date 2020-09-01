package com.htsc.sign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * created by Kimone
 * date 2020/9/1
 */
@Controller
public class ViewController {

    @RequestMapping("/registerPage")
    public ModelAndView registerPage() {
        return new ModelAndView("register");
    }

    @RequestMapping("/registerSuccess")
    public ModelAndView registerSuccess() {
        return new ModelAndView("registerSuccess");
    }

    @RequestMapping("/logInPage")
    public ModelAndView LogInPage() {
        return new ModelAndView("login");
    }

    @RequestMapping("/logInSuccess")
    public ModelAndView logInSuccess() {
        return new ModelAndView("LogInSuccess");
    }

}
