package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist musicArtist1 = new MusicArtist("Джон Леннон", 1940);
        MusicArtist musicArtist2 = new MusicArtist("Ринго Стар", 1940);
        MusicArtist musicArtist3 = new MusicArtist("Пол Маккартни", 1942);
        MusicArtist musicArtist4 = new MusicArtist("Джордж Харрисон", 1943);

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(musicArtist1);
        members1.add(musicArtist2);
        members1.add(musicArtist3);
        members1.add(musicArtist4);

        MusicBand musicBand1 = new MusicBand("The Beatles", 1960, members1);

        MusicArtist musicArtist5 = new MusicArtist("Фредди Меркьюри", 1946);
        MusicArtist musicArtist6 = new MusicArtist("Джон Дикон", 1951);
        MusicArtist musicArtist7 = new MusicArtist("Брайан Мэй", 1949);
        MusicArtist musicArtist8 = new MusicArtist("Роджер Тейлор", 1943);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(musicArtist5);
        members2.add(musicArtist6);
        members2.add(musicArtist7);
        members2.add(musicArtist8);

        MusicBand musicBand2 = new MusicBand("Queen", 1970, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
