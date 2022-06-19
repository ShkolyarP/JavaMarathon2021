package day14;

public class Person {

    private final String name;
    private int year;

    public Person (String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
