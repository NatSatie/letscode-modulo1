package event;

import client.Client;
import event.commands.CreateAccountNaturalPerson;

public class CreateAccount extends ActionEvent {
    public CreateAccount(Client user){
        super(user);
    }

    public void receiveInput(){
        super.command = super.reader.next();
    }

    public void createAccountNaturalPerson(){
        return;
    }

}
