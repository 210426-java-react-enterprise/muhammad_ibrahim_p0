package com.revature.muhammad_ibrahim_p0.util;

import com.revature.muhammad_ibrahim_p0.models.Customer;

import java.util.ArrayList;

public class CustomerTracker {

    private Customer customer;

    //public CustomerTracker(Customer customer, ArrayList<CustomerInfo> customerInfo) { this.customer = customer; }
    public CustomerTracker(Customer customer) { this.customer = customer; }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //public ArrayList<CustomerInfo>
}
