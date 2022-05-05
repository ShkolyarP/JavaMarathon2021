package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random random = new Random();
        for (int i =0; i< array.length; i++)
            array[i] = random.nextInt(10000);
        int sum = 0;
        int idx = 0;
        for (int i = 1; i< (array.length - 1); i++){
            int x = array[i]+array[i-1]+array[i+1];
            if (sum < x) {
                sum = x;
                idx = i - 1;
            }
        }
System.out.println(sum);
System.out.println(idx);
    }
}
