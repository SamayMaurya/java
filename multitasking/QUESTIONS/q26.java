class Customer {
    private int balance = 0;

    public synchronized void withdrawal(int amount) {
        if (amount > balance) {
            try {
                System.out.println("Bhikari");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        balance = balance - amount;
        System.out.println("Withdrawal amount = " + amount + ", New Balance = " + balance);
    }

    public synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit amount = " + amount + ", New Balance = " + balance);
        notify();
    }
}

class WithdrawalThread implements Runnable {
    private Customer customer;
    private int amount;

    public WithdrawalThread(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void run() {
        customer.withdrawal(amount);
    }
}

class DepositThread implements Runnable {
    private Customer customer;
    private int amount;

    public DepositThread(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void run() {
        customer.deposit(amount);
    }
}

class q26 {
    public static void main(String args[]) {
        Customer customer = new Customer();

        Thread withdrawalThread = new Thread(new WithdrawalThread(customer, 500));
        Thread depositThread = new Thread(new DepositThread(customer, 700));

        withdrawalThread.start();
        depositThread.start();
    }
}
