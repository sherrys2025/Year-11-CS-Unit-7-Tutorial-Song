import java.util.*;
public class Song {

    private String title;
    private String artist;

    private ArrayList<String> listen = new ArrayList<>();


    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int howMany(ArrayList<String> names){
        int ct = 0;
        for (String i: names){
            if (!listen.contains(i.toLowerCase())){
                ct++;
                listen.add(i.toLowerCase());
            }
        }
        return ct;
    }



}
