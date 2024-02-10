public class Savings extends Account {
    private short depositNumber;

    public Savings(float initialBalance) {
        super(initialBalance);
        this.depositNumber = 0;
        setAccountType("Savings");
    }

    public void withdrawal(float amount) {
        super.withdrawal(amount);

        if (getBalance() < 500.00) {
            System.out.println("Charging a fee of $10 because you are below $500");
            super.withdrawal(10);
        }
    }

    public void deposit(float amount) {
        depositNumber++;
        System.out.println("This is deposit " + depositNumber + " in this account");
        if (depositNumber >= 6) {
            System.out.println("Charging a fee of $10");
            withdrawal(10);
        }
        super.deposit(amount);
    }

    public void addInterest() {
        final float interestRate = 0.015f; 
        float interestEarned = getBalance() * interestRate;
        float newBalance = getBalance() + interestEarned;
        System.out.println("Customer earned " + interestEarned + " in interest");
        this.setBalance(newBalance);
    }
}
