package bank_account_app;

public interface IRate {

    //Write a methods that returns the Base Rate.
    default double getBaseRate() {
        return (2.5);
    }
}
