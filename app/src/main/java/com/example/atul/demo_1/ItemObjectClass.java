package com.example.atul.demo_1;

/**
 * Created by Atul on 3/3/2016.
 */
public class ItemObjectClass {


    private String songName;
    private String songYear;
    private String songAuthor;


    public ItemObjectClass(String songName, String songYear, String songAuthor) {
        this.songName = songName;
        this.songYear = songYear;
        this.songAuthor = songAuthor;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongYear() {
        return songYear;
    }

    public void setSongYear(String songYear) {
        this.songYear = songYear;
    }

    public String getSongAuthor() {
        return songAuthor;

    }

    public void setSongAuthor(String songAuthor) {
        this.songAuthor = songAuthor;
    }
}

