package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {
    @Autowired
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
