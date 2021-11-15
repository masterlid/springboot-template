package tv.lid.springboot.users.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EditController {
    @GetMapping("/create")
    public ModelAndView create(final Map<String, Object> model) {
        return new ModelAndView("layouts/create", model);
    }

    @GetMapping("/edit/{userId}")
    public ModelAndView edit(@PathVariable final String userId, final Map<String, Object> model) {
        return new ModelAndView("layouts/edit", model);
    }
}
