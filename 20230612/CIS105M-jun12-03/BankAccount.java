public class BankAccount{
    //ATTRIBUTES
    private int accountID;
    private String accountName;
    private double cashBalance = 0;

    //CONSTRUCTORS
    public BankAccount(int accountID, String accountName) {
        this.accountID = accountID;
        this.accountName = accountName;
    }
    public BankAccount(int accountID, String accountName, double cashBalance) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.cashBalance = cashBalance;
    }

    //GETTERS
    public int getAccountID() {
        return this.accountID;
    }
    public String getAccountName() {
        return this.accountName;
    }
    public double getCashBalance() {
        return this.cashBalance;
    }

    public String inquireBalance() {
        return this.accountID + " " + this.accountName + " : " + this.cashBalance;
    }

    //SETTERS
    public void setCredit(double creditAmount) {
        if (creditAmount > 0) {
            this.cashBalance = this.cashBalance + creditAmount;
        } else System.out.println(creditAmount + " is below Zero. Amount cannot be credited.");
    }

    public void setDebit(double debitAmount) {
        if (debitAmount <= this.cashBalance) {
            this.cashBalance = this.cashBalance - debitAmount;
        } else System.out.println(debitAmount + " is less than the current balance. Amount cannot be debited.");
    }
}