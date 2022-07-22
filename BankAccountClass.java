import java.util.Random;
import java.util.ArrayList; // 
import java.util.Collections; // 
import java.lang.reflect.Array; // for array creation

public class BankAccountClass { // Create a BankAccountClass class.
    private String accountNumber;
    private Double checkingBalance;
    private Double savingsBalance;

    private static int numberOfAccounts = 0;
    private static double totalBalance = 0.0;

    public BankAccountClass(String newNumber, Double newChecking, Double Savings) {
        accountNumber = random10();
        checkingBalance = newChecking;
        savingsBalance = Savings;
        setNumberOfAccounts(getNumberOfAccounts() + 1);
    }

    // getter
    public static int getPeopleCount() {
        return getNumberOfAccounts();
    }

    // setter
    public void setNumberOfAccounts(int number) {
        setNumberOfAccounts(number);
    }

    // getter
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // setter
    public void setCheckingBalance(double checkingBalance) {
        checkingBalance = checkingBalance + checkingBalance;
    }

    // getter
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // setter
    public void setSavingsBalance(double savingsBalance) {
        savingsBalance = savingsBalance + savingsBalance;
    }

    // getter
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void setNumberofAccouts(int numberOfAccounts) {
        BankAccountClass.numberOfAccounts = numberOfAccounts;
    }

    // Random Account Number Generator
    private String random10() {
        Random ran = new Random();
        String charList = "0123456789";
        StringBuffer accountNumber = new StringBuffer(); // create a StringBuffer object
        for (int i = 0; i < 10; i++) {
            int number = (ran.nextInt(9 - 0));
            char ch = charList.charAt(number);
            accountNumber.append(ch);
        }
        return (accountNumber.toString());
    }

    // Make a depost
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
            System.out.println("Account Type Error, could not complete withdrawl of " + value + " not completed");
            return value;
        }
    }
}
