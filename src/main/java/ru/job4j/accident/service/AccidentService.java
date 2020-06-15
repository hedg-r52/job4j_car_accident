package ru.job4j.accident.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

import java.util.Map;

@Component
public class AccidentService {

    private AccidentMem accidentMem;

    @Autowired
    public AccidentService(AccidentMem accidentMem) {
        this.accidentMem = accidentMem;
    }

    public Map<Integer, Accident> getAll() {
        return accidentMem.getAll();
    }

    public void add(Accident accident) {
        accidentMem.add(accident);
    }

}
