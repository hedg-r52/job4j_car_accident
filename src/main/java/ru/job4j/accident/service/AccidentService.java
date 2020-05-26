package ru.job4j.accident.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentJdbcTemplate;
import ru.job4j.accident.repository.AccidentMem;

import java.util.List;
import java.util.Map;

@Component
public class AccidentService {

    private final AccidentJdbcTemplate accidentJdbcTemplate;

    @Autowired
    public AccidentService(AccidentJdbcTemplate accidentJdbcTemplate) {
        this.accidentJdbcTemplate = accidentJdbcTemplate;
    }

    public List<Accident> getAll() {
        return accidentJdbcTemplate.getAll();
    }

    public void add(Accident accident) {
        accidentJdbcTemplate.save(accident);
    }

}
