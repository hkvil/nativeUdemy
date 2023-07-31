package com.example.restoblox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView mainsCard,startersCard,dessertsCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainsCard = findViewById(R.id.cardview_main);
        startersCard = findViewById(R.id.cardview_starters);
        dessertsCard = findViewById(R.id.cardview_desserts);

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this,MainCoursesActivity.class);
                startActivity(mainCoursesActivityIntent);
            }
        });
        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessertIntent = new Intent(MainActivity.this, DessertsActivity.class);
                startActivity(dessertIntent);
            }
        });



    }
}