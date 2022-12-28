package solid.lsp;

public abstract class AbstarctOrder {
    protected Integer price;
    protected Integer qnt;

    public AbstarctOrder(int qnt, int price) {
        this.price = price;
        this.qnt = qnt;
    }

    public abstract Integer getAmount(); 
        

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}