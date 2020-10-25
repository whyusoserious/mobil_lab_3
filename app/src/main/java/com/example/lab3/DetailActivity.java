package com.example.lab3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle arg = getIntent().getExtras();
        String details = arg.get("ARG_ITEM_DETAILS").toString();

        TextView tv = findViewById(R.id.textView);
        tv.setText(details);

    }
}
