package com.example.android.adagio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Genres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        TextView country = (TextView) findViewById(R.id.country);
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(Genres.this, play_screen.class);
                startActivity(countryIntent);
            }
        });

        TextView hipHop = (TextView) findViewById(R.id.hip_hip);
        hipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hipIntent = new Intent(Genres.this, play_screen.class);
                startActivity(hipIntent);
            }
        });
    }
}
