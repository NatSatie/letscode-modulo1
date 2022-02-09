package com.company;

import account.Account;
import account.CheckingAccount;
import client.Client;
import client.NaturalPerson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class AppSystem {
    private static ArrayList<Client> users = new ArrayList<Client>(
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

    public static ArrayList<Client> getUsers() {
        return users;
    }

    public static Client searchUser(String userDocument) {
        for (Client c : users){
            if ( c.getClient().getDocument().equals(userDocument)){
                return c;
            }
        } return null;
    }

    public static void addClient(Client newUser) {
        users.add(newUser);
    }
}
