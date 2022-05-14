package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private final String nameBand;
    private final int yearBand;
    private List<MusicArtist> bandMember;

    public MusicBand(String nameBand, int yearBand, List<MusicArtist> bandMember) {
        this.nameBand = nameBand;
        this.yearBand = yearBand;
        this.bandMember = bandMember;
    }

    public int getYearBand() {
        return yearBand;
    }

    public List<MusicArtist> getBandMember() {
        return bandMember;
    }

    public void printMembers() {
        System.out.println("Список участников группы:");
        for (MusicArtist musicArtist : getBandMember())
            System.out.println(musicArtist.getNameMember());
        System.out.println("--------------------------");
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (ArrayList<MusicArtist> member : musicBand1.bandMember
        )
            musicBand2.bandMember.add((MusicArtist) member);

        musicBand1.bandMember.clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", yearBand=" + yearBand +
                '}';
    }
}
