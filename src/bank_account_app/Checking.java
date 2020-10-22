package bank_account_app;

public class Checking extends Account {

    //List a properties specific to a Checking account.
    private long debitCardNumber;
    private int debitCardPIN;

    //Constructor to initialize Checking account properties.
    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "2"+ accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = (0.15*getBaseRate());
    }

    //List any methods specific to the Checking account.

    public void setDebitCard() {
        debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features: ");
        System.out.println
                (
                "* Debit Card Number -> "+debitCardNumber+
                "\n* Debit Card PIN -> "+debitCardPIN
                );
    }


}
