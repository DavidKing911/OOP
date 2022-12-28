package solid.lsp;

public class OrderBonus extends AbstarctOrder{

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public Integer getAmount() {
        return 0;
    }
}