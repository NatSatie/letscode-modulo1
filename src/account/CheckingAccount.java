package account;

import java.math.BigDecimal;

public class CheckingAccount extends Account{
    public CheckingAccount(BigDecimal earningPercentage){
        super(earningPercentage);
    }

    public CheckingAccount(BigDecimal earningPercentage, BigDecimal balance){
        super(earningPercentage, balance);
    }
}
