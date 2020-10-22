package bank_account_app;

public class Savings extends Account {

    //List a properties specific to a Savings account.
    private int safetyDepositBoxID; // 3 Digits Number
    private int safetyDepositBoxKey;  //  4 Digits Code

    //Constructor to initialize settings for the Savings account properties.
    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1"+ accountNumber;

        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = (getBaseRate() - 0.25);
    }

    //List any methods specific to the Savings account.
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random()* 1000);
        safetyDepositBoxKey = (int) (Math.random()* 10000);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features: ");
        System.out.println("* Safety Deposit Box ID -> "+safetyDepositBoxID+
                         "\n* Safety Deposit Box Key -> "+safetyDepositBoxKey
        );
    }

}
