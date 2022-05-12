package day11.task1;

public class Warehouse {
    private int countPickedOrders = 0; //(количество собранных заказов)
    private int countDeliveredOrders = 0; //(количество доставленных заказов)

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incPickedOrder() {
        countPickedOrders++;
    }

    public void incDeliveredOrder() {
        countDeliveredOrders++;
    }

    public String toString() {
        return "количество собранных заказов " + countPickedOrders + ", количество доставленных заказов " + countDeliveredOrders;
    }
}
