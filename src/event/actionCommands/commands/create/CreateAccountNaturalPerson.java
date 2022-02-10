package event.actionCommands.commands.create;

import account.CheckingAccount;
import account.InvestAccount;
import account.SavingsAccount;
import client.Client;
import com.company.AppSystem;
import event.actionCommands.commands.CommandAction;
import event.actionCommands.commands.receive.ReceiveCommand;
import event.actionCommands.enums.CreateCommandNaturalPerson;

import java.math.BigDecimal;


public class CreateAccountNaturalPerson extends CommandAction implements CreateAccountInterface {
    public CreateAccountNaturalPerson(Client user){
        super(user);
    }

    public void createCheckingAccount(){
        super.user.addAccount(new CheckingAccount(BigDecimal.ZERO));
        AppSystem.addClient(super.user);
        System.out.println("    Conta corrente criada com sucesso!");
    }

    public void createSavingsAccount(){
        super.user.addAccount(new SavingsAccount(BigDecimal.valueOf(0.01)));
        AppSystem.addClient(super.user);
        System.out.println("    Conta poupanca criada com sucesso!");
    }

    public void createInvestAccount(){
        super.user.addAccount(new InvestAccount(BigDecimal.valueOf(0.03)));
        AppSystem.addClient(super.user);
        System.out.println("    Conta investimento criada com sucesso!");
    }

    public void createAll(){
        super.user.addAccount(new CheckingAccount(BigDecimal.ZERO));
        super.user.addAccount(new SavingsAccount(BigDecimal.valueOf(0.01)));
        super.user.addAccount(new InvestAccount(BigDecimal.valueOf(0.03)));
        AppSystem.addClient(super.user);
        System.out.println("    Conta corrente, poupanca e investimento criadas com sucesso!");
    }

    @Override
    public void action(){
        this.message();
        super.receiveInput();
        if (super.command.equals(CreateCommandNaturalPerson.CHECKING.getCommand())){
            this.createCheckingAccount();
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandNaturalPerson.SAVINGS.getCommand())) {
            this.createSavingsAccount();
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandNaturalPerson.INVEST.getCommand())) {
            this.createInvestAccount();
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandNaturalPerson.ALL.getCommand())){
            this.createAll();
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandNaturalPerson.QUIT.getCommand())){
            this.exit();
        } else {
            this.action();
        }
    }

    @Override
    public void message(){
        System.out.println(
                "     Por favor digite qual conta ativar:\r\n" +
                " [1] Conta Corrente (rendimento anual 0%)\r\n" +
                "      - Saques, depositos, transferencias nao tem custo\r\n" +
                " [2] Conta Poupanca (rendimento anual 1%)\r\n" +
                " [3] Conta Investimentos (rendimento anual 3%)\r\n" +
                "      - Contas de pessoas fisicas tem rendimento \r\n" +
                "        menor que uma conta de pessoa juridica (2% a menos) \r\n" +
                " [4] Todas acima \r\n" +
                " [0] Sair \r\n"
        );
    }
}
