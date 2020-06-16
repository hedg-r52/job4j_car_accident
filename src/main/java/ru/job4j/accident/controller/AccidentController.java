package ru.job4j.accident.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.service.AccidentService;
import ru.job4j.accident.utils.AccidentUtils;
import ru.job4j.accident.utils.RuleUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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
        modelAndView.addObject("types", AccidentUtils.getAccidentTypes());
        modelAndView.addObject("rules", RuleUtils.getRules());
        modelAndView.setViewName("accidentEdit");
        return modelAndView;
    }

    @PostMapping
    public String addAccident(@ModelAttribute("accident") Accident accident, HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("type.id"));
        accident.setType(AccidentUtils.getById(id));

        Set<Rule> rules = new LinkedHashSet<>();
        for(String stringId : request.getParameterValues("ruleIds")) {
            int ruleId = Integer.parseInt(stringId);
            rules.add(RuleUtils.getById(ruleId));
        }
        accident.setRules(rules);

        this.accidentService.add(accident);
        return "redirect:/";
    }

    private List<AccidentType> getAccidentTypes() {
        List<AccidentType> types = new ArrayList<>();
        types.add(AccidentType.of(1, "Две машины"));
        types.add(AccidentType.of(2, "Машина и человек"));
        types.add(AccidentType.of(3, "Машина и велосипед"));
        return types;
    }
}
