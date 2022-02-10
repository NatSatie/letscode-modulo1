package transaction.invest;

import client.Client;
import transaction.transation.Transaction;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Invest implements Transaction {
    public static void invest(Client user, BigDecimal value){
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        user.getInvestAccount().addBalance(value);
        System.out.println("    Valor de " +  realFormat.format(value) + " foi adicionado na conta de investimentos");
        user.getBalance();
    }

    public static void transfer(Client user, BigDecimal value){
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        user.getInvestAccount().addBalance(value);
        System.out.println("    Valor de " +  realFormat.format(value) + " foi adicionado na conta de investimentos");
        user.getBalance();
    }
}
