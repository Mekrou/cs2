public class Account {
    protected static int initAccountNumber;
    protected int number;
    protected float balance;

    public int getNumber() {
        return this.number;
    }

    public float getBalance() {
        return this.balance;
    }
    
    public void setBalance(float newBalance) {
        this.balance = newBalance;
    }

    public void withdrawal(float amount) {
        this.balance -= amount;
    }

    public void deposit(float amount) {
        if (Float.isNaN(amount))
            throw new IllegalArgumentException("Amount is NAN!");
        else if (amount < 0) 
            throw new IllegalArgumentException("Cannot deposit a negative/zero amount!");
        this.balance += amount;
    }

    static {
        initAccountNumber = 10001;
    }

    public Account() {
        this.number = initAccountNumber;
        initAccountNumber++;
        this.balance = 0.0f;

    }

    public Account(float initialBalance) {
        this();
        this.balance = initialBalance;
    }
}
