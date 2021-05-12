package com.revature.muhammad_ibrahim_p0.models;

public class Transaction {

    private int transactionId;
    private String transactionType;
    private double transactionAmount;
    private int accountId;
    private double accountBalance;
    private int customerId;

    public Transaction() {

    }

    public Transaction(int transactionId, String transactionType, double transactionAmount, int accountId,
                       double accountBalance, int customerId) {
        System.out.println("Transaction constructor invoked!");
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.customerId = customerId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getaccountBalance() {
        return accountBalance;
    }

    public void setaccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("transactionId=").append(transactionId);
        sb.append(", transactionType='").append(transactionType).append('\'');
        sb.append(", transactionAmount=").append(transactionAmount);
        sb.append(", accountId=").append(accountId);
        sb.append(", accountBalance='").append(accountBalance).append('\'');
        sb.append(", customerId=").append(customerId);
        sb.append('}');
        return sb.toString();
    }
}
