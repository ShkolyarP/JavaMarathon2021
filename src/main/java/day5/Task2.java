package day5;


public class Task2 {
    public static void main(String[] args) {
Bike bike = new Bike("BMW", "blu", 2020);
System.out.println(bike.getModel());
System.out.println(bike.getColor());
System.out.println(bike.getYear());
    }
}

class Bike {
    private final String model;
    public String getModel(){
        return model;
    }
    private final String color;
    public String getColor(){
        return color;
    }
    private final int year;
    public int getYear(){
        return year;
    }

    public Bike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
