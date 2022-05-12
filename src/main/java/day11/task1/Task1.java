package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker = new Picker("Bob", 0, warehouse1);
        Courier courier = new Courier("Ivan", 0, warehouse1);
        Picker picker1 = new Picker("Joe", 0, warehouse1);
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker("James", 0, warehouse2);
        Courier courier2 = new Courier("Kirk", 0, warehouse2);

        businessProcess(picker);
        businessProcess(courier);
        picker1.bonus();
        picker2.doWork();
        courier2.doWork();

        System.out.println(warehouse1);
        System.out.println(picker);
        System.out.println(courier);
        System.out.println(picker1);
        System.out.println(picker2);
        System.out.println(courier2);


    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
