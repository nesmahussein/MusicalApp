package com.example.nesma.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Songs> songs=new ArrayList<Songs>();

        songs.add(new Songs("Hello","Adele",R.drawable.ic_album_black_36dp));
        songs.add(new Songs("Roar","Ketty berry",R.drawable.ic_album_black_36dp));
        songs.add(new Songs("Halo","beyonce",R.drawable.ic_album_black_36dp));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
    }

