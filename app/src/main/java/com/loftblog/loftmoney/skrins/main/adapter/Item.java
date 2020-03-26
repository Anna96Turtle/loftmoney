package com.loftblog.loftmoney.skrins.main.adapter;

public class Item {
    private String name;
    private String value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
