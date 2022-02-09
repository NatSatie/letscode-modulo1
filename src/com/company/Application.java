package com.company;

import account.Account;
import account.CheckingAccount;
import client.Client;
import client.NaturalPerson;
import client.Person;
import event.EventHandler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        EventHandler event = new EventHandler();
        event.welcome();
    }
}