package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
int[] array = new int[100];
        Random random = new Random();
        for (int i =0; i<array.length; i++)
            array[i] = random.nextInt(10000);
        int max = 0;
        int min = 10000;
        int zero = 0;
        int sumZero = 0;
        for (int element:array){
        if (element > max)
            max = element;
        if (element < min)
            min = element;
        if ((element%10) == 0) {
            zero++;
            sumZero = sumZero + element;
        }

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(zero);
        System.out.println(sumZero);
    }
}
