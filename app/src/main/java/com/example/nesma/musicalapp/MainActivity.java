package com.example.nesma.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button songsButton=(Button)findViewById(R.id.songs);
        Button albumButton=(Button)findViewById(R.id.album);
        Button playlistButton=(Button)findViewById(R.id.playlist);
        Button artistsButton=(Button)findViewById(R.id.artists);

        //songs button click to open song activity
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent=new Intent(MainActivity.this,SongsActivity.class) ;
                startActivity(songsIntent);
            }
        });

        //playlist button click to open playlist activity
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListIntent=new Intent(MainActivity.this,PLayListActivity.class) ;
                startActivity(playListIntent);
            }
        });

        //album button click to open album activity
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent=new Intent(MainActivity.this,AlbumActivity.class) ;
                startActivity(albumIntent);
            }
        });

        //artist button click to open artist activity
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent=new Intent(MainActivity.this,ArtistsActivity.class) ;
                startActivity(artistsIntent);
            }
        });
    }
}
