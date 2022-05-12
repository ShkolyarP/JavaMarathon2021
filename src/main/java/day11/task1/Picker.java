package day11.task1;

public class Picker implements Worker {
    private String namePicker;
    private int salary; //(заработная плата)
    private boolean isPayed = false; //(был выплачен бонус или нет)

    private Warehouse id; //id склада

    public Picker(String namePicker, int salary, Warehouse id) {
        this.namePicker = namePicker;
        this.salary = salary;
        this.id = id;
    }

    public String getNamePicker() {
        return namePicker;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Сборщик " + namePicker + " зарплата " + salary;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        id.incPickedOrder();

    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else if (id.getCountPickedOrders() >= 10000) {
            salary = salary + 70000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }

    }
}
