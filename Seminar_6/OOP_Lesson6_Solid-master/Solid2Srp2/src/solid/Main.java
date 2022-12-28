package solid;

import solid.srp.models.ConsoleInput;
import solid.srp.models.Order;
import solid.srp.models.Persister;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = (new ConsoleInput().inputFromConsole());
        Persister persister = new Persister("SolidSrp2\\src\\solid\\order.json");
        persister.saveToJson(order);
    }
}