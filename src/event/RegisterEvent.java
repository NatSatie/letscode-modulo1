package event;

import client.Client;
import client.LegalPerson;
import client.NaturalPerson;

public class RegisterEvent extends EventHandler {
    public RegisterEvent(String document){
        super(document);
    }

    @Override
    public void next(){
        return;
    }

    public Client createUser(){
        System.out.println("**** Registro de cliente novo ****");
        System.out.println("     Digite [F] para pessoa fisica e [J] para pessoa juridica:");
        String input = reader.next();
        if (input.equals("F")){
            System.out.println("**** Cadastro de pessoa fisica ****");
            return createNaturalPerson();
        } else if (input.equals("J")){
            System.out.println("**** Cadastro de pessoa juridica ****");
            return createLegalPerson();
        } else {
            System.out.println("**** Input invalido, tente novamente ****");
            this.createUser();
        } return null;
    }

    public Client createNaturalPerson(){
        System.out.println("     Digite seu nome:");
        String name = reader.next();
        return new Client(new NaturalPerson(super.document, name));
    }

    public Client createLegalPerson(){
        System.out.println("     Digite nome da empresa:");
        String name = reader.next();
        return new Client(new LegalPerson(super.document, name));
    }
}