public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("", 0.00, 0.00);
        // BankAccount acc2 = new BankAccount("", 0.00, 0.00);
        System.out.println("Total of accounts: " + BankAccount.getNumberOfAccts());
        // BankAccount acc3 = new BankAccount("", 0.00, 0.00);
        user1.deposit("Checking", 45.00);
        user1.withdrawl("Checking", 28.00);
        user1.deposit("Savings", 13.00);
        user1.withdrawl("Savings", 11.00);
        System.out.println("Checking balance total: " + user1.getCheckingBalance());
        System.out.println("Checking + Savings total: " + user1.getTotalBalance());
    }
}