package com.zyf.pattern.principle.liskovSubstitution.methodoutput;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}