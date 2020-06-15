package ru.job4j.accident.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.job4j.accident.service.AccidentService;

@Controller
public class IndexController {

    private AccidentService accidentService;

    @Autowired
    public IndexController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("accidents", accidentService.getAll());
        return "index";
    }
}
