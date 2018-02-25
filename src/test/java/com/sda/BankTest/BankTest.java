package com.sda.BankTest;

import com.sda.Bank.Bank;
import com.sda.Bank.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {
    private Bank bank;

    @Before
    public void init() {
        this.bank = new Bank("Test");
    }

    @Test
    public void shouldAddUser() {
        //Given
        //Bank bank = new Bank("Test");
        User user = new User("Szymon", "Nowak");
        //When
        boolean result = bank.addUser(user);
        //Then
        Assert.assertTrue("Method returned false", result);
        Assert.assertEquals("User is not present in bank list", 1, bank.getUsers().size());
    }

    @Test
    public void shouldNotAddNullUser() {
        //Bank bank = new Bank("Test");
        //Given
        User user = null;
        //When
        boolean result = bank.addUser(user);
        //Then
        Assert.assertFalse("Method returned true", result);
        Assert.assertEquals("User is present in bank list", 0, bank.getUsers().size());
    }
}
