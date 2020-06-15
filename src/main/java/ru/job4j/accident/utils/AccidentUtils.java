package ru.job4j.accident.utils;

import ru.job4j.accident.model.AccidentType;

import java.util.ArrayList;
import java.util.List;

public class AccidentUtils {
    public static List<AccidentType> getAccidentTypes() {
        List<AccidentType> types = new ArrayList<>();
        types.add(AccidentType.of(1, "Две машины"));
        types.add(AccidentType.of(2, "Машина и человек"));
        types.add(AccidentType.of(3, "Машина и велосипед"));
        return types;
    }
}
