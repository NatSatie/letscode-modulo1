package event.actionCommands.commands;

import client.Client;
import event.EndEvent;
import event.EventHandler;

public class CommandAction extends EventHandler implements CommandInterface {
    protected String command;

    public CommandAction(Client user){
        super(user);
    }

    public void receiveInput(){
        this.command = super.reader.next();
    }

    public void exit(){
        System.out.println("Sair");
        new EndEvent().next();
    }

    public void action(){
        return;
    }

    public void message(){
        return;
    }
}
