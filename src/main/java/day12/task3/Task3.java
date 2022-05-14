package day12.task3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("The Beatles", 1960);
        MusicBand musicBand2 = new MusicBand("Queen", 1970);
        MusicBand musicBand3 = new MusicBand("Led Zeppelin", 1968);
        MusicBand musicBand4 = new MusicBand("Pink Floyd", 1965);
        MusicBand musicBand5 = new MusicBand("Black Veil Brides", 2006);
        MusicBand musicBand6 = new MusicBand("Fall Out Boy", 2001);
        MusicBand musicBand7 = new MusicBand("ABBA", 1972);
        MusicBand musicBand8 = new MusicBand("My Chemical Romance", 2001);
        MusicBand musicBand9 = new MusicBand("OneRepublic", 2002);
        MusicBand musicBand10 = new MusicBand("U2", 1976);

        List<MusicBand> musicBand = new ArrayList<>();

        musicBand.add(musicBand1);
        musicBand.add(musicBand2);
        musicBand.add(musicBand3);
        musicBand.add(musicBand4);
        musicBand.add(musicBand5);
        musicBand.add(musicBand6);
        musicBand.add(musicBand7);
        musicBand.add(musicBand8);
        musicBand.add(musicBand9);
        musicBand.add(musicBand10);

        System.out.println(musicBand);

        Collections.shuffle(musicBand);
        System.out.println(musicBand);

        groupsAfter2000(musicBand);


    }

    private static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {

        List<MusicBand> musicBandAfter2000 = new ArrayList<>();
        for (MusicBand band : musicBands
        ) {
            if (band.getYearBand() > 2000) {
                musicBandAfter2000.add(band);
            }
        }
        System.out.println(musicBandAfter2000);
        return musicBandAfter2000;
    }


}
