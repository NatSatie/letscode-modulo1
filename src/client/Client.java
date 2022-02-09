package client;

import account.Account;

import java.util.ArrayList;

public class Client {
    private Person client;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Client(Person client){
        this.client = client;
    }
    public Client(Person client, ArrayList<Account> accounts){
        this.client = client;
        this.accounts = accounts;
    }

    public Person getClient() {
        return client;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account newAccount) {
        this.accounts.add(newAccount);
    }
}
