package com.example.ramya.mvvm_example;

import android.databinding.BaseObservable;

public class LoginDetails extends BaseObservable {

    private String userName, password;

    public LoginDetails(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
