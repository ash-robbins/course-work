package com.techelevator;

public class BankAccount implements Accountable {

    private String accountHolderName;
    private String accountNumber;
    private int balance;
    // added
    private BankAccount destinationAccount;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // added
    public BankAccount (BankAccount destinationAccount){
        this.destinationAccount = destinationAccount;
    }

    //added
    public BankAccount getDestinationAccount(){
        return destinationAccount;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }

    //added
    public int transferTo(BankAccount destinationAccount, int transferAmount){
       balance = withdraw(transferAmount);
       destinationAccount.deposit(transferAmount);
       return getBalance();
    }


}
