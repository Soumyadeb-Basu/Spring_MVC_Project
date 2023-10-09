package controllers;

import Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contact() {
        return "Contact";
    }

    @PostMapping("/process")
    public ModelAndView formProcess(@RequestParam String name, @RequestParam String email, ModelAndView modelAndView) {
        modelAndView.addObject("name",name);
        modelAndView.addObject("email",email);
        modelAndView.setViewName("Info");
        return modelAndView;
    }

    @PostMapping("/processModel")
    public String formProcessModel(@ModelAttribute User user) {
        return "Info";
    }

}
