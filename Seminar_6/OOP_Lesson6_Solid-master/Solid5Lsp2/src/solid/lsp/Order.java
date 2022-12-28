package solid.lsp;

public class Order extends AbstarctOrder {

    public Order(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public Integer getAmount() {

        return qnt * price;
    }

}