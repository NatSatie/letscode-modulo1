package sketch.account;

import sketch.client.Client;

import java.math.BigDecimal;

public class Action {

    public BigDecimal checkBalance(Account target){
        return target.getBalance();
    }

    public void createAccount(Client user, AccountType accountType){
        return;
    }

    public void invest(Client user, BigDecimal value){
        return;
    }

    public void transfer(Client user, Client target, BigDecimal value){
        return;
    }

    public void deposit(Client user, BigDecimal value){
        return;
    }

    public void withdraw(Client user, BigDecimal value){
        return;
    }
}
