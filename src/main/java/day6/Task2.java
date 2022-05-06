package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2015, 64, 143000);
        airplane.setYear(2018);
        airplane.setLength(74);
        airplane.fillUp(5000);
        airplane.fillUp(150000);
        airplane.info();

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
}
