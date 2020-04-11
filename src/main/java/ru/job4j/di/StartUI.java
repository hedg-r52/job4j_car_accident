package ru.job4j.di;

public class StartUI {
    private Store store;

    public StartUI(Store store) {
        this.store = store;
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
