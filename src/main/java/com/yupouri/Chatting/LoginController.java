package com.yupouri.Chatting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLoginForm(ModelAndView mav) {
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView inputName(@RequestParam("name") String name, ModelAndView mav) {
        System.out.println("\n\n" + name + "\n\n");
        return new ModelAndView("redirect:/login");
    }

}
