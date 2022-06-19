package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("TenNumbers");
        printSumDigits(file);

    }

    private static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            if (numbersString.length != 10)
                throw new IllegalArgumentException();

            int counter = 0;
            int[] numbers = new int[10];
            int sum = 0;

            for (String number :
                    numbersString) {
                numbers[counter++] = Integer.parseInt(number);
                sum = sum + numbers[counter - 1];
            }

            System.out.println(Arrays.toString(numbers));
            System.out.println(sum);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }


    }
}
