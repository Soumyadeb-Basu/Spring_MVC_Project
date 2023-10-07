package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class AboutSPELController {

    @GetMapping("/spel")
    public ModelAndView returnSpel() {
        ModelAndView modelAndView= new ModelAndView();
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        modelAndView.addObject("input","Spring Expression Language");
        modelAndView.addObject("list",numbers);
        modelAndView.setViewName("AboutSPEL");
        return modelAndView;
    }
}
