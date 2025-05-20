public class Account {
    // Each account has an ID, a name, and a balance (starts at 0 by default)
    private String id;
    private String name;
    private int balance = 0;

    // Constructor for when you're setting up an account without an initial balance
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor for when you want to start the account with some money already in it
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Get the account ID
    public String getID() {
        return id;
    }

    // Get the name of the account holder
    public String getName() {
        return name;
    }

    // Check how much money is in the account
    public int getBalance() {
        return balance;
    }

    // Add money to the account
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Take money out, if there's enough in there
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeds balance");
        }
        return balance;
    }

    // Transfer money to another account, if you can afford it lol
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeds balance");
        }
        return balance;
    }

    // Return a simple string showing account details
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
