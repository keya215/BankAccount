package com.flexon.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class BankAccount {

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    public BankAccount(String accountNumber, String balance, String customerName, String emailAddress, String phoneNumber) {
        AccountNumber = accountNumber;
        Balance = balance;
        CustomerName = customerName;
        EmailAddress = emailAddress;
        PhoneNumber = phoneNumber;
    }

    private String AccountNumber;
    private String Balance;
    private String CustomerName;
    private String EmailAddress;
    private String PhoneNumber;

}



