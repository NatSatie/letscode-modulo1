package event.actionCommands.commands.create;

import account.CheckingAccount;
import account.InvestAccount;
import account.SavingsAccount;
import client.Client;
import com.company.AppSystem;
import event.actionCommands.commands.CommandAction;
import event.actionCommands.commands.receive.ReceiveCommand;
import event.actionCommands.enums.CreateCommandLegalPerson;

import java.math.BigDecimal;


public class CreateAccountLegalPerson extends CommandAction implements CreateAccountInterface {
    public CreateAccountLegalPerson(Client user){
        super(user);
    }

    public void createCheckingAccount(){
        super.user.addAccount(new CheckingAccount(BigDecimal.ZERO));
        AppSystem.addClient(super.user);
        System.out.println("    Conta corrente criada com sucesso!");
    }

    public void createInvestAccount(){
        super.user.addAccount(new InvestAccount(BigDecimal.valueOf(0.05)));
        AppSystem.addClient(super.user);
        System.out.println("    Conta investimento criada com sucesso!");
    }

    public void createAll(){
        super.user.addAccount(new CheckingAccount(BigDecimal.ZERO));
        super.user.addAccount(new InvestAccount(BigDecimal.valueOf(0.05)));
        AppSystem.addClient(super.user);
        System.out.println("    Conta corrente e investimento criadas com sucesso!");
    }

    @Override
    public void action(){
        this.message();
        super.receiveInput();
        if (super.command.equals(CreateCommandLegalPerson.CHECKING.getCommand())){
            this.createCheckingAccount();
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandLegalPerson.INVEST.getCommand())) {
            this.createInvestAccount();
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandLegalPerson.ALL.getCommand())){
            this.createAll();
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandLegalPerson.QUIT.getCommand())){
            super.exit();
        } else {
            this.action();
        }
    }

    @Override
    public void message(){
        System.out.println(
                "     Por favor digite qual conta ativar:\r\n" +
                " [1] Conta Corrente (rendimento anual 0%)\r\n" +
                "      - Para cada saque ou transferencia tem 0.5% de taxa\r\n" +
                " [2] Conta Investimentos (rendimento anual 3%)\r\n" +
                "      - Contas de pessoas juridicas tem rendimento \r\n" +
                "        maior que uma conta de pessoa fisica (2% a mais) \r\n" +
                " [3] Todas acima \r\n" +
                " [0] Sair \r\n"
        );
    }
}
