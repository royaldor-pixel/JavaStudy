package com.set;

import org.jetbrains.annotations.NotNull;

public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    Song(String t, String a, String r, String b){
        this.title = t;
        this.artist = a;
        this.rating = r;
        this.bpm = b;
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString(){
        return title;
    }

    @Override
    public int compareTo(Song s) {
        return this.title.compareTo(s.title);
    }
}
