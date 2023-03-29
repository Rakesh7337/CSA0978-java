public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. A $5 penalty has been charged.");
            balance -= 5;
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest(double rate) {
        balance *= (1 + rate);
    }

    public static void main(String[] args) {
        // Create an account with an initial balance of $1000
        Account myAccount = new Account(1000);

        // Deposit $1000
        myAccount.deposit(1000);

        // Withdraw $200
        myAccount.withdraw(200);

        // Inquire the current balance
        System.out.println("Current balance: $" + myAccount.getBalance());

        // Compute interest at a rate of 5%
        myAccount.addInterest(0.05);

        // Inquire the current balance after adding interest
        System.out.println("Current balance after adding interest: $" + myAccount.getBalance());
    }
}