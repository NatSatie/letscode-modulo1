package transaction.transation;

import client.Client;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Deposit implements Transaction {
    public static void action(Client user, BigDecimal value){
        user.getCheckingAccount().removeBalance(value);
        user.getBalance();
    }
}
