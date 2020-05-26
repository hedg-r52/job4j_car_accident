package ru.job4j.accident.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentHibernate;
import java.util.List;

@Component
public class AccidentService {

    private final AccidentHibernate service;

    @Autowired
    public AccidentService(AccidentHibernate service) {
        this.service = service;
    }

    public List<Accident> getAll() {
        return service.getAll();
    }

    public void add(Accident accident) {
        service.save(accident);
    }

}
