package event;

import client.Client;

public class LoginEvent extends EventHandler {
    public LoginEvent(String document){
        super(document);
    }

    public boolean isValidUser(){
        return true;
    }

    @Override
    public void next(){
        super.user = new RegisterEvent(super.document).createUser();
    }

    public Client loginUser(){
        System.out.println("     # do documento " + super.document);
        this.next();
        return super.user;
    }
}
