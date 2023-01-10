package com.company;

public class Airplane extends Transport {
    private String route;

    public Airplane(String name, String brand, String route) {
        super(name, brand);
        this.route = route;
    }

    @Override
    public void print() {
        System.out.println("name: " + getName() +
                "\nbrand: " + getBrand() +
                "\nroute: " + route);


    }
}
