package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView todoCardView, travelCardView;
    RecyclerView travelRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoCardView = findViewById(R.id.card_view_todo);
        travelCardView = findViewById(R.id.card_view_travel);



        todoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent todoIntent = new Intent(MainActivity.this, TodoActivity.class);
                startActivity(todoIntent);
            }
        });

        travelCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travelIntent = new Intent(MainActivity.this,TravelActivity.class);
                startActivity(travelIntent);

            }
        });
    }
}