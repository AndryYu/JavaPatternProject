package com.zyf.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent{
    private String name;
    private List<CatalogComponent> item ;

    public CourseCatalog(String name) {
        this.name = name;
        item = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(CatalogComponent component) {
        item.add(component);
    }

    @Override
    public void remove(CatalogComponent component) {
        item.remove(component);
    }

    @Override
    public void print() {
        System.out.println("课程目录"+name);
        for (CatalogComponent componet:item) {
            System.out.print("  ");
            componet.print();
        }
    }
}
