package com.example.ramya.mvvm_example;

import java.io.Serializable;

/**
 * Created by Ramya on 12/7/2017.
 */

public class Data implements Serializable{

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
