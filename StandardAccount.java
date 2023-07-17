public class StandardAccount implements IAccount {
    private int accountNumber;
    private double creditLimit;
    private double balance;

    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = (creditLimit >= 0) ? 0 : creditLimit;
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        double maxWithdrawal = balance - creditLimit;
        if(amount > maxWithdrawal)
        {
        	balance -= maxWithdrawal;
        	return maxWithdrawal;
        }
        else
        {
        	balance-=amount;
        	return amount;
        }
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
