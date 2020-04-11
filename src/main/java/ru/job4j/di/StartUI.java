package ru.job4j.di;

public class StartUI {
    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value) {
        this.store.add(value);
    }

    public void print() {
        for (String value: this.store.getAll()) {
            System.out.println(value);
        }
    }
}
