public class CashRegister {
    private double amountCollected;

    public CashRegister() {
        this.amountCollected = 0.0;
    }

    public CashRegister(double amountCollected) {
        this.amountCollected = amountCollected;
    }

    public double getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(double amountCollected) {
        this.amountCollected = amountCollected;
    }

    public void addToAmountCollected(double amount) {
        this.amountCollected += amount;
    }
}