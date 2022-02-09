package event.actionCommands.commands.create;

import client.Client;
import event.actionCommands.enums.CreateCommandLegalPerson;


public class CreateAccountLegalPerson extends CreateAccount {
    public CreateAccountLegalPerson(Client user){
        super(user);
    }

    @Override
    public void action(){
        this.message();
        super.receiveInput();
        if (super.command.equals(CreateCommandLegalPerson.CHECKING.getCommand())){
            this.createCheckingAccount();
        } else if (super.command.equals(CreateCommandLegalPerson.INVEST.getCommand())) {
            System.out.println("Criar conta corrente");
        } else if (super.command.equals(CreateCommandLegalPerson.ALL.getCommand())){
            System.out.println("Criar conta corrente");
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
                " [2] Conta Poupanca (rendimento anual 1%)\r\n" +
                " [3] Conta Investimentos (rendimento anual 3%)\r\n" +
                "      - Contas de pessoas juridicas tem rendimento \r\n" +
                "        maior que uma conta de pessoa fisica (2% a mais) \r\n" +
                " [4] Todas acima \r\n" +
                " [0] Sair \r\n"
        );
    }
}
