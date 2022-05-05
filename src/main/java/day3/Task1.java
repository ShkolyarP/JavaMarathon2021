package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String city = scanner.nextLine();
            if (city.equals("Stop"))
                break;

            switch (city) {
                case "Владивосток":
                case "Ростов":
                case "Москва":
                    System.out.println("Россия");
                    break;
                case "Лондон":
                case "Ливерпуль":
                case "Манчестер":
                    System.out.println("Англия");
                    break;
                case "Милан":
                case "Рим":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Берлин":
                case "Кельн":
                case "Мюнхен":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
