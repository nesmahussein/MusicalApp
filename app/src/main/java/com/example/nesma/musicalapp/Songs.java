package com.example.nesma.musicalapp;

public class Songs {
    String songName;
    String artistName;
    int imageResource;
    String songDuration;
    String playListName;
    String NO_SONG_NAME_PROVIDED = "";


    Songs(String mSongName, String mArtistName, int mImageResource, String mSongDuration) {
        songName = mSongName;
        artistName = mArtistName;
        imageResource = mImageResource;
        songDuration = mSongDuration;
    }

    Songs(String mSongName, String mArtistName, int mImageResource) {
        songName = mSongName;
        artistName = mArtistName;
        imageResource = mImageResource;
    }

    Songs(String mSongName, int mImageResource) {
        songName = mSongName;
        imageResource = mImageResource;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getSongDuration() {
        return songDuration;
    }
}