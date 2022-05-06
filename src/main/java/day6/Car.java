package day6;

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
 void info () {
 System.out.println("Это автомобиль");
    }
 int yearDifference(int inputYear){
     int yearDifference = Math.abs(inputYear-year);
     return yearDifference;
     }
 }
