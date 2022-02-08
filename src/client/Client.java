package client;

import account.Account;

import java.util.ArrayList;

public class Client {
    private Person client;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Client(Person client){
        this.client = client;
    }

    public Person getClient() {
        return client;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
