public class TestAccount {
    public static void main(String[] args) {
        // Set up two accounts with some starting money
        Account acc1 = new Account("A001", "Alice", 5000);
        Account acc2 = new Account("A002", "Bob", 4000);

        // Show the balances before doing anything
        System.out.println("Initial Balances:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());

        // Move $1000 from one account to the other
        acc1.transferTo(acc2, 1000);

        // Show the updated balances after the transfer
        System.out.println("\nAfter Transfer of $1000 from Account 1 to Account 2:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());
    }
}
