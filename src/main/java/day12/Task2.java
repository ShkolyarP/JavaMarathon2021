package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> even = new ArrayList<>();
        arrayEven(0, 30, even);
        arrayEven(300, 350, even);

        System.out.println(even);

    }

    private static void arrayEven(int start, int last, List<Integer> list) {
        for (int i = start; i <= last; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

    }
}
