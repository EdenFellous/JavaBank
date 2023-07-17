import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void openAccount(IAccount account) {
        accounts.add(account);
    }

    @Override
    public void closeAccount(int accountNumber) {
        for (IAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                if (account.getCurrentBalance() > 0) {
                    accounts.remove(account);
                    return;
                } else {
                    System.out.println("Account cannot be closed due to debt.");
                    return;
                }
            }
        }
        System.out.println("Account not found.");
    }

    @Override
    public List<IAccount> getAllAccounts() {
        return accounts;
    }

    @Override
    public List<IAccount> getAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.getCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    @Override
    public List<IAccount> getAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.getCurrentBalance() > balanceAbove) {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }
}
