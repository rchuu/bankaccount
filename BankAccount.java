import java.util.Random;

// ● Create a BankAccount class.
public class BankAccount {

    // ● The class should have the following attributes: (double) checking balance,
    // (double) savings balance.
    private String accountNum;
    private Double checkingBal;
    private Double savingsBal;

    // ● Create a class member (static) that has the number of accounts created thus
    // far.
    private static int numberOfAccts = 0;
    // ● Create a class member (static) that tracks the total amount of money stored
    // in every account created.
    private static double totalBal = 0.00;

    public BankAccount(String newNum, Double newChecking, Double Savings) {
        accountNum = random10();
        checkingBal = newChecking;
        savingsBal = Savings;
        // ● In the constructor, be sure to increment the account count.
        setNumberOfAccts(getNumberOfAccts() + 1);
    }

    // ● Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return checkingBal;
    }

    // ● Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return savingsBal;
    }

    // ● Create a method that will allow a user to deposit money into either the
    // checking or saving, be sure to add to total amount stored.
    public void deposit(String accType, double value) {
        if (accType == "Checking") {
            checkingBal = checkingBal + value; // add to checking balance
            totalBal = totalBal + value; // add to total balance
            // } else {
            // System.out.println("Account Type Error, deposit of " + value + " not
            // completed");
        }
        if (accType == "Savings") {
            savingsBal = savingsBal + value;
            totalBal = totalBal + value;

            // } else {
            // System.out.println("Account Type Error, deposit of " + value + " not
            // completed");
        }
    }

    // ● Create a method to withdraw money from one balance. Do not allow them to
    // withdraw money if there are insufficient funds.
    public double withdrawl(String accType, double value) {

        if (accType == "Checking") {
            if (value > checkingBal) {
                System.out.println("Insufficient Funds");
                return checkingBal;
            } else {
                checkingBal = checkingBal - value;
                totalBal = totalBal - value;
                return value;
            }
        }

        if (accType == "Savings") {
            if (value > savingsBal) {
                System.out.println("Insufficient Funds");
                return savingsBal;
            }
            savingsBal = savingsBal - value;
            totalBal = totalBal - value;
            return value;
        } else {
            System.out.println("Account Type Error, could not complete withdrawl of " + value + " not completed");
            return value;
        }
    }

    // ● Create a method to see the total money from the checking and saving.
    public double getTotalBalance() {
        return checkingBal + savingsBal;
    }

    // getter
    public static int getPeopleCount() {
        return getNumberOfAccts();
    }

    // setter
    public void setNumberofAccts(int number) {
        setNumberOfAccts(number);
    }

    // setter
    public void setCheckingBalance(double checkingBalance) {
        checkingBal = checkingBal + checkingBalance;
    }

    // setter
    public void setSavingsBalance(double savingsBalance) {
        savingsBal = savingsBal + savingsBalance;
    }

    public static int getNumberOfAccts() {
        return numberOfAccts;
    }

    public static void setNumberOfAccts(int numberOfAccts) {
        BankAccount.numberOfAccts = numberOfAccts;
    }

    // Create a private method that returns a random ten digit account number.
    private String random10() {
        // In the constructor, call the private method from above so that each user has
        // a random ten digit account.
        Random ran = new Random();
        String charList = "1234567890";
        StringBuffer accnum = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            int number = (ran.nextInt(9 - 0));
            char ch = charList.charAt(number);
            accnum.append(ch);
        }
        return (accnum.toString());
    }
}
