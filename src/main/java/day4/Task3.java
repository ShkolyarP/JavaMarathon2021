package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] array = new int[8][12];
        Random random = new Random();
        for (int i = 0; i <array.length; i++){
            for (int j = 0; j <array[i].length; j++){
    array[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumIdx = 0;
            for (int i = 0; i<array.length; i++){
                int sum = 0;
                for (int j = 0; j<array[i].length; j++){
                    sum = sum + array [i][j];
                }
                if (maxSum <= sum){
                    maxSum = sum;
                maxSumIdx = i;}

            }
System.out.println(maxSumIdx);
    }
}
