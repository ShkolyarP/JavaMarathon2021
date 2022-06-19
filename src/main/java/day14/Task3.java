package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));

    }

    private static List<Person> parseFileToObjList(File file) {
        try {
            Scanner scanner = new Scanner(file);

            List<Person> people = new ArrayList<>();

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();

                Person person1 = new Person(person[0], Integer.parseInt(person[1]));
                people.add(person1);

            }

            return people;


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }


        return null;
    }
}



