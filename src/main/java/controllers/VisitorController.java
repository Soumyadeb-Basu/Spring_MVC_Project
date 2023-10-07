package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VisitorController {

    @GetMapping("/visitor")
    public ModelAndView visitor() {
        ModelAndView model = new ModelAndView();
        //setting data
        model.addObject("visitorName", "Ramesh");
        model.addObject("id",2);
        //setting view
        model.setViewName("Visitor");
        return model;
    }

}
