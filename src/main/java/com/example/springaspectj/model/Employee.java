package com.example.springaspectj.model;

import com.example.springaspectj.aspect.*;


public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    @Loggable
    public void setName(String nm) {
        this.name=nm;
    }

    public void throwException(){
        throw new RuntimeException("Dummy Exception");
    }

}