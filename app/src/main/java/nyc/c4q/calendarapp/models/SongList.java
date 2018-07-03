package nyc.c4q.calendarapp.models;


import java.util.List;

class SongList {
    String name;
    List<Artist> artist;

    public String getName() {
        return name;
    }

    public List<Artist> getArtist() {
        return artist;
    }
}