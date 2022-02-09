package transaction;

import client.Client;

import java.math.BigDecimal;

public class Transfer {
    public static void action(Client user, Client target, BigDecimal value){
        user.getCheckingAccount().removeBalance(value);
        target.getCheckingAccount().addBalance(value);
    }
}
