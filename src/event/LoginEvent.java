package event;

import client.Client;
import com.company.AppSystem;

public class LoginEvent extends EventHandler {
    public LoginEvent(String document){
        super(document);
    }

    public boolean isValidUser(){
        return true;
    }

    @Override
    public void next(){
        if (AppSystem.searchUser(super.document) == null){
            super.user = new RegisterEvent(super.document).createUser();
        }
    }

    public Client loginUser(){
        System.out.println("     # do documento " + super.document);
        Client searchUser = AppSystem.searchUser(super.document);
        if (searchUser == null){
            super.user = new RegisterEvent(super.document).createUser();
        } else {
            super.user = searchUser;
        }
        return super.user;
    }
}
