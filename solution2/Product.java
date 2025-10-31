package solution2;

class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double salesTaxAmount = price * Taxable.salesTax;
        System.out.println("Solution2.Product Sales Tax: $" + salesTaxAmount);
    }
}
