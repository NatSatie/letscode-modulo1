package account;

import java.math.BigDecimal;

public class SavingsAccount extends Account{
    public SavingsAccount(BigDecimal earningPercentage){
        super(earningPercentage);
    }

    public SavingsAccount(BigDecimal earningPercentage, BigDecimal balance){
        super(earningPercentage, balance);
    }
}
