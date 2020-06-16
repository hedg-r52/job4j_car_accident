package ru.job4j.accident.utils;

import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.model.Rule;

import java.util.ArrayList;
import java.util.List;

public class RuleUtils {
    public static List<Rule> getRules() {
        List<Rule> rules = new ArrayList<>();
        rules.add(Rule.of(1, "Статья. 1"));
        rules.add(Rule.of(2, "Статья. 2"));
        rules.add(Rule.of(3, "Статья. 3"));
        return rules;
    }

    public static Rule getById(int id) {
        Rule result = null;
        for(Rule r : getRules()) {
            if (id == r.getId()) {
                result = r;
                break;
            }
        }
        return result;
    }
}
