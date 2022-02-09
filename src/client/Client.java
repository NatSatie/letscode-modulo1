package client;

import account.Account;
import account.CheckingAccount;
import account.InvestAccount;
import account.SavingsAccount;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

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

    public void getBalance(){
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        for (Account a : this.accounts){
            if (a instanceof CheckingAccount){
                System.out.println("    Saldo da conta corrente: " + realFormat.format(a.getBalance()));
            } else if (a instanceof SavingsAccount){
                System.out.println("    Saldo da conta poupanca: " + realFormat.format(a.getBalance()));
            } else if (a instanceof InvestAccount){
                System.out.println("    Saldo da conta investimento: " + realFormat.format(a.getBalance()));
            }
        }
    }

    public Account getCheckingAccount(){
        for (Account a : this.accounts){
            if (a instanceof CheckingAccount){
                return a;
            }
        } return null;
    }

    public Account getSavingsAccount(){
        for (Account a : this.accounts){
            if (a instanceof SavingsAccount){
                return a;
            }
        } return null;
    }

    public Account getInvestAccount(){
        for (Account a : this.accounts){
            if (a instanceof InvestAccount){
                return a;
            }
        } return null;
    }
}
