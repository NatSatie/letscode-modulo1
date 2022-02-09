package event.actionCommands.commands.create;

import account.CheckingAccount;
import account.InvestAccount;
import account.SavingsAccount;
import client.Client;
import com.company.AppSystem;
import event.actionCommands.commands.CommandAction;

import java.math.BigDecimal;

public class CreateAccount extends CommandAction implements CreateAccountInterface {
    public CreateAccount(Client user){
        super(user);
    }

    public void createCheckingAccount(){
        super.user.addAccount(new CheckingAccount(BigDecimal.ZERO));
        AppSystem.addClient(super.user);
        System.out.println("    Conta corrente criada com sucesso!");
    }

    public void createSavingsAccount(BigDecimal percentage){
        super.user.addAccount(new SavingsAccount(percentage));
        AppSystem.addClient(super.user);
        System.out.println("    Conta poupanca criada com sucesso!");
    }

    public void createInvestAccount(BigDecimal percentage){
        super.user.addAccount(new InvestAccount(percentage));
        AppSystem.addClient(super.user);
        System.out.println("    Conta investimento criada com sucesso!");
    }

    public void createAllNatural(BigDecimal savings, BigDecimal invest){
        super.user.addAccount(new CheckingAccount(BigDecimal.ZERO));
        super.user.addAccount(new SavingsAccount(savings));
        super.user.addAccount(new InvestAccount(invest));
        AppSystem.addClient(super.user);
        System.out.println("    Conta corrente, poupanca e investimento criadas com sucesso!");
    }

    public void action(){
    }

    public void message(){
    }
}
