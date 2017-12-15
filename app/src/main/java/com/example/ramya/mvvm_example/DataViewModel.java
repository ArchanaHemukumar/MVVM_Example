package com.example.ramya.mvvm_example;

import android.databinding.BaseObservable;

/**
 * Created by Ramya on 12/7/2017.
 */

public class DataViewModel extends BaseObservable {

    private Data data;

    public DataViewModel(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }
}
