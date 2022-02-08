package sketch.client;

import sketch.client.person.Person;
import sketch.client.person.PersonType;

import java.math.BigDecimal;

public class Client {
    private Person person;
    private BigDecimal saldo;
    private PersonType personType;

    public Client(String name, String document, PersonType personType){
        this.person = new Person(name, document, personType);
        this.saldo = BigDecimal.ZERO;
    }

     public String getClientName(){
        return person.getName();
     }

     public Person getPerson(){
        return this.person;
     }

}
