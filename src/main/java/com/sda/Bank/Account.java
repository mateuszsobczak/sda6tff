package com.sda.Bank;

public class Account {
    private int id;
    private int userId;
    private int amount;

    public Account(){

    }

    public Account(int userId, int amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
