package com.company;

public abstract class Transport implements Printable {
    private String name;
    private String brand;

    public Transport(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void print();
}
