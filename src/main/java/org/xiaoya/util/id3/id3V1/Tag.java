package org.xiaoya.util.id3.id3V1;

public class Tag {
    private String title;
    private String artist;
    private String album;
    private String year;
    private String comment;
    private int genre;

    public Tag(String title, String artist, String album, String year, String comment, int genre) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.comment = comment;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getYear() {
        return year;
    }

    public String getComment() {
        return comment;
    }

    public int getGenre() {
        return genre;
    }
}
