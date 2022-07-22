public class BankAccountClassTest {
    public static void main(String[] args) {
        BankAccountClass user1 = new BankAccountClass("", 0.00, 0.00);
        System.out.println(BankAccountClass.getNumberOfAccounts());
        user1.deposit("Checking", 100.00);
        user1.withdrawl("Checking", 20.00);
        System.out.println(user1.getCheckingBalance());
    }
}
