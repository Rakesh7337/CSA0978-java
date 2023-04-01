class Customer {
    private int accountNo;
    private String accName;
    private double balance;
    
    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }
    
    public synchronized void deposit(double amount) {
        System.out.println("Depositing " + amount + " into account " + accountNo);
        balance += amount;
        notify();
    }
    
    public synchronized void withdraw(double amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance in account " + accountNo + ", waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Withdrawing " + amount + " from account " + accountNo);
        balance -= amount;
    }
}

 class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(123456, "John Doe", 1000);
        Thread t1 = new Thread(() -> {
            customer.withdraw(500);
        });
        Thread t2 = new Thread(() -> {
            customer.deposit(1000);
        });
        t1.start();
        t2.start();
    }
}