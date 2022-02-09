package event;

import client.Client;
import client.LegalPerson;
import client.NaturalPerson;
import event.actionCommands.commands.create.CreateAccountLegalPerson;
import event.actionCommands.commands.create.CreateAccountNaturalPerson;
import event.actionCommands.commands.receive.ReceiveCommand;

public class ActionEvent extends EventHandler {

    public ActionEvent(Client user){
        super(user);
    }

    public void verifyClientHasAccount(){
        if (super.user.getAccounts().size() == 0){
            System.out.println("**** Para usar as funcoes do aplicativo, ative sua conta ****");
            if (super.user.getClient() instanceof NaturalPerson){
                new CreateAccountNaturalPerson(super.user).action();
            } else if (super.user.getClient() instanceof LegalPerson){
                new CreateAccountLegalPerson(super.user).action();
            }
        } else {
            new ReceiveCommand(super.user).action();
        }
    }
}
