package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String all = "";

        for (int i=1; i<=20000; i++){
        all = all + i + " ";
        }
System.out.println(all);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        long startTime2 = System.currentTimeMillis();
        StringBuilder all1 = new StringBuilder("");
        for (int i=1; i<=20000; i++){
            all1.append(i + " ");
        }
        System.out.println(all1);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));
    }
}
