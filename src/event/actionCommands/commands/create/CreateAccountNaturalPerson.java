package event.actionCommands.commands.create;

import client.Client;
import event.actionCommands.commands.receive.ReceiveCommand;
import event.actionCommands.enums.CreateCommandNaturalPerson;

import java.math.BigDecimal;


public class CreateAccountNaturalPerson extends CreateAccount {
    public CreateAccountNaturalPerson(Client user){
        super(user);
    }

    @Override
    public void action(){
        this.message();
        super.receiveInput();
        if (super.command.equals(CreateCommandNaturalPerson.CHECKING.getCommand())){
            super.createCheckingAccount();
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandNaturalPerson.SAVINGS.getCommand())) {
            super.createSavingsAccount(BigDecimal.valueOf(0.01));
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandNaturalPerson.INVEST.getCommand())) {
            super.createInvestAccount(BigDecimal.valueOf(0.03));
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandNaturalPerson.ALL.getCommand())){
            super.createAllNatural(BigDecimal.valueOf(0.01), BigDecimal.valueOf(0.03));
            new ReceiveCommand(super.user).action();
        } else if (super.command.equals(CreateCommandNaturalPerson.QUIT.getCommand())){
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
