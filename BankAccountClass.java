import java.util.Random;
// import java.util.ArrayList; //
// import java.util.Collections; //
// import java.lang.reflect.Array; // for array creation

public class BankAccountClass { // Create a BankAccountClass class.
    private String accountNumber;
    private Double checkingBalance;
    private Double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double totalBalance = 0.0;

    public BankAccountClass() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = BankAccountClass.random10();
    }

    // ● Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // ● Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // getter
    public static int getPeopleCount() {
        return getNumberOfAccounts();
    }

    // setter
    public void setNumberOfAccounts(int number) {
        setNumberOfAccounts(number);
    }

    // setter
    public void setCheckingBalance(double checkingBalances) {
        checkingBalance = checkingBalance + checkingBalances;
    }

    // setter
    public void setSavingsBalance(double savingsBalances) {
        savingsBalance = savingsBalance + savingsBalances;
    }

    // getter
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void setNumberofAccouts(int numberOfAccounts) {
        BankAccountClass.numberOfAccounts = numberOfAccounts;
    }

    // Random Account Number Generator
    private static String random10() {
        Random ran = new Random();
        String charList = "0123456789";
        StringBuffer accountNumber = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            int number = (ran.nextInt(9 - 0));
            char ch = charList.charAt(number);
            accountNumber.append(ch);
        }
        return (accountNumber.toString());
    }

    // ● Create a method that will allow a user to deposit money into either the
    // checking or saving, be sure to add to total amount stored.
    public void deposit(String accountType, double value) {
        if (accountType == "Checking") {
            checkingBalance = checkingBalance + value;
            totalBalance = totalBalance + value;
        } else {
            System.out.println("Account Type Error, deposit of " + value + " has failed");
        }
        if (accountType == "Savings") {
            savingsBalance = savingsBalance + value;
            totalBalance = totalBalance + value;
        } else {
            System.out.println("Account Type Error, deposit of " + value + " has failed");
        }
    }

    // Make a withdrawal
    public double withdrawl(String type, double value) {

        if (type == "Checking") {
            if (value > checkingBalance) {
                System.out.println("Insufficient Funds");
                return checkingBalance;
            } else {
                checkingBalance = checkingBalance - value;
                totalBalance = totalBalance - value;
                return value;
            }
        }

        if (type == "Savings") {
            if (value > savingsBalance) {
                System.out.println("Insufficient Funds");
                return savingsBalance;
            }
            savingsBalance = savingsBalance - value;
            totalBalance = totalBalance - value;
            return value;
        } else {
            System.out.println("Account Type Error, could not complete withdrawl of " +
                    value + " not completed");
            return value;
        }
    }
}