package com.example.studentportal.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.studentportal.Adapter.NotificationAdapter;
import com.example.studentportal.Model.NotificationModel;
import com.example.studentportal.R;

import java.util.ArrayList;
import java.util.List;


public class notification extends Fragment {
    RecyclerView recyclerView;
    NotificationAdapter notificationAdapter;
    List<NotificationModel> DataList;
    List<NotificationModel> Datalist =new ArrayList<>();

    NotificationModel notificationModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_notification, container, false);
        recyclerView=v.findViewById(R.id.recyclerview);

        notificationAdapter=new NotificationAdapter(getContext(), Datalist);
        recyclerView.setAdapter(notificationAdapter);

        for(int i =0; i<5; i++){
            notificationModel=new NotificationModel("james");
            Datalist.add(notificationModel);
            notificationAdapter.notifyDataSetChanged();
        }
        return v;
    }
}