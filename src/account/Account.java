package account;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    protected BigDecimal balance;
    protected BigDecimal earningPercentage;

    public Account(BigDecimal earningPercentage){
        this.balance = BigDecimal.ZERO;
        this.earningPercentage = earningPercentage;
    }

    public Account(BigDecimal earningPercentage, BigDecimal balance){
        this.balance = balance;
        this.earningPercentage = earningPercentage;
    }
    
    public BigDecimal getBalance(){
        return this.balance;
    }

    public void addBalance(BigDecimal value){
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        this.balance = this.balance.add(value);
        System.out.println("    Valor de " +  realFormat.format(value) + " foi adicionado na conta");
    }

    public void removeBalance(BigDecimal value){
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        this.balance = this.balance.subtract(value);
        System.out.println("    Valor de " +  realFormat.format(value) + " foi removido da conta");
    }
}
