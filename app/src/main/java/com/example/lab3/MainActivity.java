package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private DummyContent content = new DummyContent();
    private RViewAdapter rViewAdapter = new RViewAdapter(this, content.ITEMS);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rView = findViewById(R.id.list);
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setAdapter(rViewAdapter);
    }
}