package com.sda.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private UserService userService;
    private AccountService accountService;

    public Bank(String name) {
        this.name = name;
        this.userService = new UserService();
        this.accountService = new AccountService();
    }

    public String getName() {
        return name;
    }

    public UserService getUserService() {
        return userService;
    }

    public boolean addUser(User user) {
        return userService.addUser(user);
    }

    public int getNumberOfUsers() {
        return userService.getNumberOfUsers();
    }

    public boolean createAccount(int userId, Account account) {
        boolean result = false;
        if (userService.isUserPresent(userId)) {
            accountService.addAccount(account);
            result = true;
        }
        return true;
    }

    public boolean changeAmount(Account account, int amount) {
        boolean result = false;
        if (accountService.isAccountPresent(account.getId())) {
            account.setAmount(account.getAmount() + amount);
            result = true;
        }
        return result;
    }

    public Account getAccount(int accountId) {
        return accountService.getAccount(accountId);
    }

    public int getNumberOfAccounts() {
        return accountService.getNumberOfAccounts();
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
}
