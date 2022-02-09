package transaction;

import client.Client;

import java.math.BigDecimal;

public class Withdraw {
    public static void action(Client user, BigDecimal value){
        user.getCheckingAccount().removeBalance(value);
    }
}
