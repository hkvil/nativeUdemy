package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TodoActivity extends AppCompatActivity {

    RecyclerView todoRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        //1
        todoRecyclerView = findViewById(R.id.recycler_view_todo);
        //2
        Todo[] todos = {
                new Todo("Write a chapter of your book or complete a writing prompt."),
                new Todo("Go for a 30-minute jog or brisk walk around your neighborhood."),
                new Todo("Clean and organize your desk or workspace."),
                new Todo("Plan and prepare a healthy meal for yourself."),
                new Todo("Call or video chat with a friend or family member you haven't spoken to in a while."),
                new Todo("Read at least one chapter of a book you've been wanting to finish."),
                new Todo("Learn a new recipe and cook dinner from scratch."),
                new Todo("Practice a musical instrument or learn a new song."),
                new Todo("Research and start a small DIY project around the house."),
                new Todo("Meditate for 15 minutes to clear your mind and reduce stress."),
                new Todo("Update your resume or LinkedIn profile."),
                new Todo("Declutter a specific area of your home, like a closet or a drawer."),
                new Todo("Write a handwritten letter or note to someone you care about."),
                new Todo("Watch a documentary or educational video on a topic that interests you."),
                new Todo("Complete a workout routine targeting different muscle groups."),
                new Todo("Start learning a new language through an app or online resources."),
                new Todo("Volunteer for a local charity or community organization."),
                new Todo("Plan a weekend outing or day trip to explore a nearby location."),
                new Todo("Set aside time for a creative hobby, like drawing, painting, or crafting."),
                new Todo("Research and sign up for an online course or workshop to expand your skills."),

        };

        //3
        TodoAdapter todoAdapter = new TodoAdapter(todos);
        //4
        todoRecyclerView.setAdapter(todoAdapter);

    }
}