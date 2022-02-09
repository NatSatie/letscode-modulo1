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
    private ArrayList<Client> clientesExistentes = new ArrayList<Client>(
            Arrays.asList(
                    new Client(
                            new NaturalPerson("1", "MrBatata"),
                            new ArrayList<Account>(
                                    Arrays.asList(
                                            new CheckingAccount(BigDecimal.ZERO, BigDecimal.valueOf(10000))
                                    )
                            )
                    ),
                    new Client(
                            new NaturalPerson("2", "MrsRepolho"),
                            new ArrayList<Account>(
                                    Arrays.asList(
                                            new CheckingAccount(BigDecimal.ZERO, BigDecimal.valueOf(100))
                                    )
                            )
                    )

            )
    );

    public static void main(String[] args) {
        EventHandler event = new EventHandler();
        event.welcome();

    }
}