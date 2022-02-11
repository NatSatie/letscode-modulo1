package transaction.transfer;

import client.Client;
import com.company.AppSystem;

import java.math.BigDecimal;

public class Transfer{

    public static void toSomeoneElse(Client user, Client target, BigDecimal value){
        user.getCheckingAccount().removeBalance(value);
        target.getCheckingAccount().addBalance(value);
    }

    public static void toSavings(Client user, BigDecimal value){
        user.getCheckingAccount().removeBalance(value);
        user.getSavingsAccount().addBalance(value);
    }
}
