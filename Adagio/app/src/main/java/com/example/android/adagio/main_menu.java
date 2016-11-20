package com.example.android.adagio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Library
        TextView library = (TextView) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(main_menu.this, music_library.class);
                startActivity(libraryIntent);
            }
        });

        //Recent Activity
        TextView recentActivity = (TextView) findViewById(R.id.recent);
        recentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(main_menu.this, recentActivity.class);
                startActivity(recentIntent);
            }
        });

        //On rise profiles
        TextView onRise = (TextView) findViewById(R.id.rise);
        onRise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent riseIntent = new Intent(main_menu.this, on_the_rise.class);
                startActivity(riseIntent);
            }
        });


    }
}
