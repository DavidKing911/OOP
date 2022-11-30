import java.util.ArrayList;
import java.util.List;

public class zadanie_1 {
    public static void main(String[] args) {
        List<Product> prods = new ArrayList<Product>();
        prods.add(new Product("Чипсы", 70.0));
        prods.add(new Product("Батончик", 50.0));
        prods.add(new Product("Газировка", 60.0));
        prods.add(new Product("Шоколадка", 80.0));
        prods.add(new Milk("Петмол", 60.0, 5));
        prods.add(new Chocolate("Snikers", 40.0, 70.0));
        prods.add(new Chocolate("Bounty", 45.0, 90.0));
        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
    }
}