package com.mgspring.controller;


public class HelloWorld {

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.printf("hello" + name);
    }

}
