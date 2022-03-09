package com.zyf.design.pattern.structural.composite;

public class Course extends CatalogComponent{

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name："+name +" Course Price:"+price);
    }
}
