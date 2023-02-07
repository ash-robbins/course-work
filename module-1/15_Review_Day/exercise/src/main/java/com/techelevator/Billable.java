package com.techelevator;

import java.util.Map;

public interface Billable {

    double getBalanceDue(Map<String, Double> servicesRendered);

    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balance = 0.00;
        for (Map.Entry<String, Double> price : servicesRendered.entrySet()) {
            balance = servicesRendered.get("Grooming") + servicesRendered.get("Walking") + servicesRendered.get("Sitting");
        }
        return balance;
    }
}
