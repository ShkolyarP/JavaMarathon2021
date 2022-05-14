package day12.task4;

import java.util.Collection;
import java.util.List;

public class MusicBand {

    private final String nameBand;
    private final int yearBand;
    private List<String> bandMember;

    public MusicBand(String nameBand, int yearBand, List<String> bandMember) {
        this.nameBand = nameBand;
        this.yearBand = yearBand;
        this.bandMember = bandMember;
    }


    public int getYearBand() {
        return yearBand;
    }

    public List<String> getMember() {
        return bandMember;
    }

    public void printMembers() {
        System.out.println(bandMember);
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (String member : musicBand1.bandMember
        )
            musicBand2.bandMember.add(member);

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
