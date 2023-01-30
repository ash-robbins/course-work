package com.techelevator;

import javax.print.DocFlavor;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);

    }

    @Override
    public int withdraw(int amountToWithdraw) {
        //return super.withdraw(amountToWithdraw);
        if (getBalance() < 150) {
            return getBalance() - 2;
        } return getBalance() -2;
    }




}
