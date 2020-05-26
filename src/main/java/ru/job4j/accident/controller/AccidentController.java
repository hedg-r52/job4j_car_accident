package ru.job4j.accident.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.service.AccidentService;

@Controller
@RequestMapping("/add-accident")
public class AccidentController {
    private AccidentService accidentService;

    @Autowired
    public AccidentController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }

    @GetMapping
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accident", new Accident());
        modelAndView.setViewName("accidentEdit");
        return modelAndView;
    }

    @PostMapping
    public String addAccident(@ModelAttribute("accident") Accident accident) {
        this.accidentService.add(accident);
        return "redirect:/";
    }
}
