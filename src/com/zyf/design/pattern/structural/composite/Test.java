package com.zyf.design.pattern.structural.composite;


public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",99);
        CatalogComponent windowCourse = new Course("Window课程",99);

        CatalogComponent catalog = new CourseCatalog("移动开发");
        CatalogComponent android = new Course("android开发",69);
        CatalogComponent ios = new Course("ios开发",78);
        catalog.add(android);
        catalog.add(ios);

        CatalogComponent  imoocCoponent = new CourseCatalog("慕课网");
        imoocCoponent.add(linuxCourse);
        imoocCoponent.add(windowCourse);
        imoocCoponent.add(catalog);

        imoocCoponent.print();

    }
}
