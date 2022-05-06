package day6;

import day6.Car;

public class Task1 {
    public static void main(String[] args) {
        day6.Car car1 = new day6.Car();
        car1.setModel("Volkswagen");
        car1.setColor("red");
        car1.setYear(2010);
        car1.yearDifference(2000);
        car1.info();
        System.out.println(car1.yearDifference(2000));
    }
}
