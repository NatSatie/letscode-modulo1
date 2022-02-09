package transaction;

import client.Client;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Deposit {
    public static void action(Client user, BigDecimal value){
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        user.getCheckingAccount().addBalance(value);
        System.out.println("    Valor de " +  realFormat.format(value) + " foi adicionado a conta!");
        user.getBalance();
    }
}
