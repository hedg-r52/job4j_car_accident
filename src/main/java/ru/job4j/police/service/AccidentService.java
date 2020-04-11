package ru.job4j.police.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.job4j.police.model.Accident;
import ru.job4j.police.repository.AccidentRepository;

import java.util.List;

@Component
public class AccidentService {

    private AccidentRepository repository;

    @Autowired
    public AccidentService(AccidentRepository repository) {
        this.repository = repository;
    }

    public List<Accident> getAll() {
        List<Accident> result = null;
        try {
            this.repository.openConnection();
            result = this.repository.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.repository.closeConnection();
        }
        return result;
    }

}
