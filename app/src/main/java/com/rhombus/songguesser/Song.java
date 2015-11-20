package com.rhombus.songguesser;

/**
 * Created by Preetham on 11/18/2015.
 */
public class Song {
    private String title;
    private String filename;
    private String filepath;

    public Song(String _title, String _filename, String _filepath) {
        title = _title;
        filename = _filename;
        filepath = _filepath;
    }

    public String getTitle() {
        return title;
    }

    public String getFileName() {
        return filename;
    }

    public String getFilePath() {
        return filepath;
    }
}
