package day4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int [] mass = new int[number];
        for (int i = 0; i<mass.length; i++){
            mass[i] = Math.round((int)(Math.random()*10));
        }
int sum = 0;
int a = 0;
int b = 0;
int c = 0;
        for (int i:mass
             ) {
           sum = i+sum;
           int m = i%2;
           if (m==0){
               c=c+1;
           }
           if (i == 1) {
           a=a+1;
           }
           if (i>8){
               b=b+1;
           }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(mass.length);
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(mass.length-c);
        System.out.println(sum);
                
    }
}
