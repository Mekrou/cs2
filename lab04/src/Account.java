public class Account {
    protected static int initAccountNumber;
    private int number;
    private float balance;
    private String accountType;

    public int getNumber() {
        return this.number;
    }

    public float getBalance() {
        return this.balance;
    }
    
    public void setBalance(float newBalance) {
        this.balance = newBalance;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
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
        this.accountType = "default account";
    }

    public Account(float initialBalance) {
        this();
        this.balance = initialBalance;
    }
}
