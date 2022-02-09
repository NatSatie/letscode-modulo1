package event;

import account.CheckingAccount;
import client.Client;
import event.commands.CommandListNaturalPerson;

import java.math.BigDecimal;


public class CreateAccount extends ActionEvent {

    public CreateAccount(Client user){
        super(user);
    }

    public void receiveInput(){
        super.command = super.reader.next();
    }

    public void createCheckingAccount(BigDecimal percentage){
        super.user.addAccount(new CheckingAccount(percentage));
        System.out.println("    Conta corrente criada com sucesso!");
    }

    public void exit(){
        System.out.println("Sair");
        new EndEvent().next();
    }

    public void createAccountNaturalPerson(){
        this.receiveInput();
        if (super.command.equals(CommandListNaturalPerson.CHECKING.getCommand())){
            this.createCheckingAccount(BigDecimal.ZERO);
        } else if (super.command.equals(CommandListNaturalPerson.SAVINGS.getCommand())) {
            System.out.println("Criar conta corrente");
        } else if (super.command.equals(CommandListNaturalPerson.INVEST.getCommand())) {
            System.out.println("Criar conta corrente");
        } else if (super.command.equals(CommandListNaturalPerson.ALL.getCommand())){
            System.out.println("Criar conta corrente");
        } else if (super.command.equals(CommandListNaturalPerson.QUIT.getCommand())){
            this.exit();
        } else {
            createAccountNaturalPerson();
        }
    }

}
