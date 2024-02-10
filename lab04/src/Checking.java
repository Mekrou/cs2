public class Checking extends Account {
    public Checking(float initialBalance) {
        super(initialBalance);
        setAccountType("Checking");
    }

    public void withdrawal(float amount) {
        // Attempt to withdrawal a negative/zero amount
        if (amount < 0) {
            throw new IllegalArgumentException("Amount too small! Must be greater than 0!");
        }
        // Attempt to withdrawal more than the account is worth (Overdraft)
        if (amount > this.getBalance()) {
            System.out.println("Charging an overdraft fee of $20 because account balance is below $0");
            super.withdrawal(20);
        }
        super.withdrawal(amount);
    }

    public void deposit(float amount) {
        System.out.println("Doing default deposit");
        super.deposit(amount);
    }
}
