public class BasicAccount implements IAccount {
    private int accountNumber;
    private double withdrawalLimit;
    private double balance;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        double actualWithdrawal = Math.min(amount, withdrawalLimit);
        balance -= actualWithdrawal;
        return actualWithdrawal;
    }


    @Override
    public double getCurrentBalance() {
        return balance;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}

