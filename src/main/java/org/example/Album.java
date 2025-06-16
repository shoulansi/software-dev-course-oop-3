package org.example;

public class Album extends LibraryItem {

    protected int trackCount;

    public Album(String title, String author,  int year, int trackCount) {
        super(title, year, author);
        this.trackCount = trackCount;
    }

    public int getTrackCount() {
        return trackCount;
    }
    @Override
    public String toString() {
        return "org.example.Album: " + title + " by " + author + " (" + year + ") - " + trackCount + " tracks";
    }
}
