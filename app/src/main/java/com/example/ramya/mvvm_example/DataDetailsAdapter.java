package com.example.ramya.mvvm_example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.ramya.mvvm_example.databinding.LayoutDataBinding;

import java.util.ArrayList;


public class DataDetailsAdapter extends RecyclerView.Adapter<DataViewBindingHolder> {

    private ArrayList<Data> dataArrayList;

    public DataDetailsAdapter(ArrayList<Data> dataArrayList) {
        this.dataArrayList = dataArrayList;
    }

    @Override
    public DataViewBindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutDataBinding binding = LayoutDataBinding.
                inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DataViewBindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(DataViewBindingHolder holder, int position) {
        LayoutDataBinding binding = (LayoutDataBinding) holder.getDataBinding();
        binding.setData(new DataViewModel(dataArrayList.get(position)));
//        .setVariable(position, new DataViewModel(dataArrayList.get(position)));
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }
}
