package com.example.myandroidsprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1
        RecyclerView list = findViewById(R.id.recyler_view_projects);

        //2
        Project[] projects = {
                new Project("BMI Calculator","Simple BMI Calculator for American people",R.drawable.quote),
                new Project("InchesToMETER Converter","Simple Inches To Meter converter",R.drawable.tape),
                new Project("The RestoBLOX","Simple restaurant menu",R.drawable.hungry_developer)
                //maybe add my flutter project later
        };

        //3
        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        //4
        list.setAdapter(adapter);



    }
}