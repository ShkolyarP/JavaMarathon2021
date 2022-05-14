package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Джон Леннон");
        members1.add("Ринго Стар");
        members1.add("Пол Маккартни");
        members1.add("Джордж Харрисон");

        MusicBand musicBand1 = new MusicBand("The Beatles", 1960, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Фредди Меркьюри");
        members2.add("Джон Дикон");
        members2.add("Брайан Мэй");
        members2.add("Роджер Тейлор");

        MusicBand musicBand2 = new MusicBand("Queen", 1970, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();


    }
}
