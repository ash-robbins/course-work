package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();

    public Customer (String firstName, String lastName, String phoneNumber){
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName){
        //this(firstName, lastName, "");
        super(firstName, lastName);
        this.phoneNumber = "";
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public List<Pet> getPets(){
        return this.pets;
    }
    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }
    public void setPets(){
        this.pets = pets;
    }

    public double getBalanceDue(Map<String, Double> servicesRendered){
        double balance = 0.00;
        for (Map.Entry<String, Double> price : servicesRendered.entrySet()){
            balance = servicesRendered.get("Grooming") + servicesRendered.get("Walking") + servicesRendered.get("Sitting");
        } return balance;
    }

}
