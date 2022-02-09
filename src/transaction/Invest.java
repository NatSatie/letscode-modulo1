package transaction;

import client.Client;

import java.math.BigDecimal;

public class Invest {
    public static void action(Client user, BigDecimal value){
        user.getInvestAccount().addBalance(value);
    }
}
