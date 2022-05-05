package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Volkswagen");
        car1.setColor("red");
        car1.setYear(2010);
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());

    }
}

class Car {
 private String model;
 public void setModel(String modelAuto){
     model = modelAuto;
 }
 public String getModel(){
     return model;
 }
 private String color;
    public void setColor(String colorAuto) {
        color = colorAuto;
    }
    public String getColor(){
        return  color;
    }
 private int year;
    public void setYear(int yearAuto){
        year = yearAuto;
    }
    public int getYear(){
        return year;
    }
}