package com.example.studentportal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.studentportal.Fragments.home;
import com.example.studentportal.Fragments.notification;
import com.example.studentportal.Fragments.search;
import com.example.studentportal.Fragments.settings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class
homepage extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout,new home()).commit();
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                String i=item.toString();
                switch (i){
                    case "Home":
                        getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout, new home()).commit();
                        break;
                    case "Search":
                        getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout, new search()).commit();
                        break;
                    case "Notification":
                        getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout, new notification()).commit();
                        break;
                    case "Settings":
                        getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout, new settings()).commit();
                        break;
                }
                return true;
            }
        });
    }
}