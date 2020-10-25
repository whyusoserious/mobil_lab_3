package com.example.lab3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle arg = getIntent().getExtras();
        String[] details = arg.getStringArray("ARG_ITEM_DETAILS");
        SecondaryAdapter secondaryAdapter = new SecondaryAdapter(this,details);

        TextView tv1 = findViewById(R.id.textView);
        RecyclerView rv1 = findViewById(R.id.recyclerview);//Для отображения всей информации
        tv1.setText(details[0]);
        rv1.setLayoutManager(new LinearLayoutManager(this));
        rv1.setAdapter(secondaryAdapter);

    }
}
