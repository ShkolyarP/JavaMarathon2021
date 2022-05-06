package day7;

public class Task1 {
    public static void main(String[] args) {
Airplane airplane1 = new Airplane("Boeing", 2010, 75, 150000);
Airplane airplane2 = new Airplane("Boeing", 2015, 74, 143000);
Airplane.compareAirplanes(airplane1, airplane2);
    }
}

class Airplane {
    private String manufacturer;

    public void setManufacturer(String manufacturerAirplane) {
        manufacturer = manufacturerAirplane;
    }

    private int year;

    public void setYear(int yearAirplane) {
        year = yearAirplane;
    }

    private int length;

    public void setLength(int lengthAirplane) {
        length = lengthAirplane;
    }

    private int weight;

    public void setWeight(int weightAirplane) {
        weight = weightAirplane;
    }

    private int fuel;

    public void setFuel(int fuelAirplane) {
        fuel = fuelAirplane;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: "
                + weight + ", количество топлива в баке: " + fuel);
    }

    int fillUp(int n) {
        fuel = fuel + n;
        return fuel;
    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
if (airplane1.length>airplane2.length)
    System.out.println("Первый самолет длиннее");
else if (airplane1.length<airplane2.length)
    System.out.println("Второй самолет длиннее");
else
    System.out.println("Самолеты одинаковой длины");
    }
}