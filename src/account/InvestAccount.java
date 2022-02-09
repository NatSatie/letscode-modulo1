package account;

import java.math.BigDecimal;

public class InvestAccount extends Account{
    public InvestAccount(BigDecimal earningPercentage){
        super(earningPercentage);
    }

    public InvestAccount(BigDecimal earningPercentage, BigDecimal balance){
        super(earningPercentage, balance);
    }
}