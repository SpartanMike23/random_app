package com.example.android.adagio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class music_library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        TextView artist = (TextView) findViewById(R.id.artists);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(music_library.this, artist_order.class);
                startActivity(artistIntent);
            }
        });

        TextView genre = (TextView) findViewById(R.id.genre);
        genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(music_library.this, Genres.class);
                startActivity(genreIntent);
            }
        });

        TextView recent = (TextView) findViewById(R.id.recent);
        recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(music_library.this, recentActivity.class);
                startActivity(recentIntent);
            }
        });


    }
}
