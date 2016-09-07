package com.company.collections.library;

public abstract class Literature {
    private String name;

    public Literature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
