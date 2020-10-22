package bank_account_app;

import utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();



        //Read a CSV file and create new account based on that data

        String filePath = "E:\\Files\\freedom fighter\\Learning\\computer Programming\\Java\\Portfolio\\5\\New Bank Accounts\\files\\NewBankAccounts.csv";
        List<String []> newAccountHolders = CSV.read(filePath);

        for (String[] accountHolder:
             newAccountHolders) {

            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if (accountType.equals("Savings")) {

                accounts.add(new Savings(name,sSn,initDeposit));

            } else if (accountType.equals("Checking")){

                accounts.add(new Checking(name,sSn,initDeposit));

            }
            else{

                System.out.println("Error Reading The Account Type");
            }
        }


        for (Account acc :
                accounts) {

            System.out.println("\n*********************");
            acc.showInfo();
        }
    }
}
