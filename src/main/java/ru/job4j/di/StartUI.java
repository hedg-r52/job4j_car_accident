package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {
    private Store store;
    private ConsoleInput consoleInput;

    public void add(String value) {
        this.store.add(value);
    }

    public void print() {
        for (String value: this.store.getAll()) {
            System.out.println(value);
        }
    }
}
