package com.company;


public class Bus extends Transport {
    private int number;

    public Bus(String name, String brand, int number) {
        super(name, brand);
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("name: " + getName() +
                "\nbrand: " + getBrand() +
                "\nnumber: " + number);

    }
}
