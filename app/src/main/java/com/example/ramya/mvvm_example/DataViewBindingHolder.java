package com.example.ramya.mvvm_example;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Ramya on 12/7/2017.
 */

public class DataViewBindingHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding dataBinding;

    public DataViewBindingHolder(ViewDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
        dataBinding.executePendingBindings();
    }

    public ViewDataBinding getDataBinding() {
        return dataBinding;
    }

}
