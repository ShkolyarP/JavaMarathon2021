package day12.task5;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class MusicArtist extends ArrayList<MusicArtist> {
    private final String nameMember;
    private final int yearMember;

    public MusicArtist(String nameMember, int yearMember) {
        this.nameMember = nameMember;
        this.yearMember = yearMember;
    }

    public String getNameMember() {
        return nameMember;
    }


    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return super.toArray(generator);
    }
}
