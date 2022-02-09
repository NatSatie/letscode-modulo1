package event;

import client.Client;
import com.company.AppSystem;

import java.util.Scanner;

public class EventHandler implements EventInterface{
    protected String document;
    protected Scanner reader = new Scanner(System.in);
    protected Client user;

    public EventHandler(){
    }

    public EventHandler(String document){
        this.document = document;
    }

    public EventHandler(Client user){
        this.document = user.getClient().getDocument();
        this.user = user;
    }

    public void next(){
        this.user = new LoginEvent(this.document).loginUser();
        new ActionEvent(this.user).verifyClientHasAccount();
    }

    public void welcome(){
        System.out.println("**** Aplicativo de Banco da Natalia Satie ****");
        System.out.println("     Digite o numero do documento:");
        this.document = reader.next();
        this.next();
    }
}
