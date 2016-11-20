package com.example.android.adagio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class recentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);

        TextView kelly = (TextView) findViewById(R.id.kelly);
        kelly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kellyIntent = new Intent(recentActivity.this, play_screen.class);
                startActivity(kellyIntent);
            }
        });

        TextView country = (TextView) findViewById(R.id.country);
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(recentActivity.this, play_screen.class);
                startActivity(countryIntent);
            }
        });

        TextView bruno = (TextView) findViewById(R.id.brunoMars);
        bruno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent brunoIntent = new Intent(recentActivity.this, play_screen.class);
                startActivity(brunoIntent);
            }
        });
    }
}
