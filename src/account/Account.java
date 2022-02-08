package account;

import java.math.BigDecimal;

public class Account {
    protected BigDecimal balance;
    protected BigDecimal earningPercentage;

    public Account(BigDecimal earningPercentage){
        this.balance = BigDecimal.ZERO;
        this.earningPercentage = earningPercentage;
    }
}
