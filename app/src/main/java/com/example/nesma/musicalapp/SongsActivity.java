package com.example.nesma.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Songs> songs=new ArrayList<Songs>();
        songs.add(new Songs("HELLO","Adele",R.drawable.adele1,"4:29"));
        songs.add(new Songs("Rolling In The Deep Arabic","Adele",R.drawable.adele2,"4:30"));
        songs.add(new Songs("Make You Feel My Love","Adele",R.drawable.adele3,"5:00"));
        songs.add(new Songs("Hold Up","byoncé ",R.drawable.beyonce4,"5:15"));
        songs.add(new Songs("Run The world","byoncé ",R.drawable.beyonce1,"5:30"));
        songs.add(new Songs("Love On Top","byoncé ",R.drawable.beyonce2,"3:29"));
        songs.add(new Songs("Halo","byoncé ",R.drawable.beyonce3,"6:00"));
        songs.add(new Songs("Roar","Ketty Berry",R.drawable.ketty_berry1,"4:45"));
        songs.add(new Songs("Small Talk","Ketty Berry",R.drawable.ketty_berry2,"4:30"));
        songs.add(new Songs("Swish Swish","Ketty Berry ",R.drawable.ketty_berry3,"5:12"));
        songs.add(new Songs("FireWork","Ketty Berry ",R.drawable.ketty_berry4,"4:30"));
        songs.add(new Songs("Part Of Me","Ketty Berry",R.drawable.ketty_berry,"5:17"));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(SongsActivity.this, PlayActivity.class);

                startActivity(intent);
            }
        });

    }
}
