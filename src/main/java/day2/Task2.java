package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа (второе больше первого:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a<b){

            for (a=a+1; a<b; a++){
                int mod5 = a%5;
                int mod10 = a%10;
                if (mod5==0 && mod10>0){
                    System.out.print(a+" ");
                }
            }
        } else {
            System.out.println("Некорректный ввод");
        }

    }
}
