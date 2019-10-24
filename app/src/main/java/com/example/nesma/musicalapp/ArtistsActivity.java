package com.example.nesma.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Songs> songs=new ArrayList<Songs>();

        songs.add(new Songs("Adele",R.drawable.adele1));
        songs.add(new Songs("beyoncé",R.drawable.beyonce4));
        songs.add(new Songs("Ketty Berry",R.drawable.ketty_berry1));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }
}
