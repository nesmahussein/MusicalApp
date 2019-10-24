package com.example.nesma.musicalapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(Activity context, ArrayList<Songs> SongsName) {

        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and ,the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, SongsName);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link SongsName} object located at this position in the list
        Songs songName = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        songNameTextView.setText(songName.getSongName());

        // Get the version name from the current SongName object and
        // set this text on the name TextView

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        // Get the version number from the current artists Name object and
        // set this text on the number TextView
        artistNameTextView.setText(songName.getArtistName());

   // Find the imageView in the list_item.xml layout with the ID version_number
        ImageView songImageView = (ImageView) listItemView.findViewById(R.id.artists_image_view);
        songImageView.setImageResource(songName.getImageResource());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songDuration = (TextView) listItemView.findViewById(R.id.duration_song_text_view);
        // Get the version number from the current duration song object and
        // set this text on the number TextView
        songDuration.setText(songName.getSongDuration());

        return listItemView;
    }
}

