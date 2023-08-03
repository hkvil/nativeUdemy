package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TravelActivity extends AppCompatActivity {

    RecyclerView travelRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        //1
        travelRecycleView = findViewById(R.id.recycler_view_travel);
        //2
        Travel[] travels = {
                new Travel("BALI", R.drawable.bali),
                new Travel("BROMO", R.drawable.bromo),
                new Travel("KOMODO", R.drawable.komodo),
                new Travel("KUTA", R.drawable.kuta),
                new Travel("LOMBOK", R.drawable.lombok),
        };
        //3
        TravelAdapter travelAdapter = new TravelAdapter(travels);
        //4
        travelRecycleView.setAdapter(travelAdapter);

    }
}