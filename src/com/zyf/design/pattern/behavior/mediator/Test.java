package com.zyf.design.pattern.behavior.mediator;

public class Test {

    public static void main(String[] args) {
      User geely = new User("Geely");
      User tom = new User("Tom");

      geely.sendMessage("Hey! Tom! let us go!");
      tom.sendMessage("Ok! Geely!");
    }
}
