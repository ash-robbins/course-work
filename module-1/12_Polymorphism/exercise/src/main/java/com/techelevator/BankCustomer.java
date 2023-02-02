package com.techelevator;

import java.util.List;

public class BankCustomer implements Accountable {


    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts;


    public BankCustomer(){

        this.accounts = accounts;
    }

    public int getBalance(){
        return getBalance();
    }


   public String getName(){
        return name;
   }
   public String getAddress(){
        return address;
   }
   public String getPhoneNumber(){
        return phoneNumber;
   }
   public void setName(){
       this.name = name;
   }
   public void setAddress(){
       this.address = address;
   }
   public void setPhoneNumber(){
       this.phoneNumber = phoneNumber;
   }

    public Accountable[] getAccounts() {
        Accountable[] accountsArray = new Accountable[accounts.size()];
        for (int i = 0; i < accountsArray.length; i++) {
            for (Accountable balances : accounts) {
                accountsArray[i] = balances;
            }
            return accountsArray;
        } return accountsArray;
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

}
