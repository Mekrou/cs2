public class Savings extends Account {
    private short depositNumber;

    public Savings(float initialBalance) {
        super(initialBalance);
        depositNumber++;
    }

    public void withdrawal(float amount) {
        super.withdrawal(amount);

        if (this.balance < 500.00) {
            System.out.println("Chargina a fee of $10 because you are below $500");
            super.withdrawal(10);
        }
    }

    public void deposit(float amount) {
        System.out.println("This is deposit " + depositNumber + " in this account");
        if (depositNumber >= 6) {
            System.out.println("Charging a fee of $10");
            withdrawal(10);
        }
        super.deposit(amount);
    }

    public void addInterest() {
        final float interestRate = 0.015f; 
        float interestEarned = this.balance * interestRate;
        deposit(interestEarned);
    }
}
