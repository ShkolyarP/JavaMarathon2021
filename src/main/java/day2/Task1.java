package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Введите число этажей:");
        int flo = f.nextInt();
        if (flo > 1 && flo < 5) {
            System.out.println("Малоэтажный дом");
        }
            else if (flo > 4 && flo < 9){
                System.out.println("Среднеэтажный дом");
            } else if (flo > 8) {
                System.out.println("Многоэтажный дом");

            } else {
                System.out.println("Ошибка ввода");
            }

    }
}
