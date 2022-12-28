package solid;

import solid.lsp.AbstarctOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<AbstarctOrder> {
    private List<AbstarctOrder> orders = new ArrayList<>();

    public void add(AbstarctOrder order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (AbstarctOrder order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<AbstarctOrder> iterator() {
        return orders.iterator();
    }
}