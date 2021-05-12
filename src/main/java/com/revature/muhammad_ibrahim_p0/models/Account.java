package com.revature.muhammad_ibrahim_p0.models;

public class Account {

    private int accountId;
    private int customerId;
    private String accountType;
    private double accountBalance;

    public Account() {

    }

    public Account (int accountId, int customerId, String accountType, double accountBalance) {
        System.out.println("Account constructor invoked");
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accountId=").append(accountId);
        sb.append(", customerId=").append(customerId);
        sb.append(", accountType='").append(accountType).append('\'');
        sb.append(", accountBalance=").append(accountBalance);
        sb.append('}');
        return sb.toString();
    }
}
