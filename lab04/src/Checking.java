public class Checking extends Account {
    public Checking(float initialBalance) {
        super(initialBalance);
    }

    public void withdrawal(float amount) {
        // Attempt to withdrawal a negative/zero amount
        if (amount < 0) {
            throw new IllegalArgumentException("Amount too small! Must be greater than 0!");
        }
        // Attempt to withdrawal more than the account is worth (Overdraft)
        if (amount > this.balance) {
            System.out.println("Charging an overdraft fee of $20 because account balance is below $0");
            super.withdrawal(20);
        }
    }
}
