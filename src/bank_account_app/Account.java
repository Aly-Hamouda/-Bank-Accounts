package bank_account_app;


public abstract class Account implements IRate{

    //List common properties for Saving and Checking accounts
    private String name;
    private String sSn;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, String sSn, double initDeposit) {
      this.name = name;
      this.sSn = sSn;
      this.balance = initDeposit;

      //Set account number
      index++;
      this.accountNumber = setAccountNumber();
      //Initialize the rate.
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSsn = sSn.substring(sSn.length()-2,sSn.length());
        int uniqueID = index;
        int randomDigits = (int) (Math.random() *1000); //3 Digits Number
        return (lastTwoOfSsn + uniqueID + randomDigits);
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $"+accruedInterest);
        printBalance();
    }


    //List common methods ~ transactions

    public void deposit(double amount) {
        balance += amount;
        System.out.println("depositing $"+amount);
        printBalance();
    }

    public void withdraw (double amount) {
        balance -= amount;
        System.out.println("withdrawing $"+amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $"+amount +" To "+toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your Balance is now: $"+balance);
    }

    public void showInfo() {
        System.out.println(
          "Name: "+name+
        "\nAccount Number: "+accountNumber+
        "\nBalance: "+balance+"" +
        "\nRate --> "+rate+" %"
        );
    }
}
