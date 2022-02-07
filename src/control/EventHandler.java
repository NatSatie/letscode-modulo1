package control;

import client.person.PersonType;

import java.util.Scanner;

// TODO ADD EXCEPTION TREATMENT

public class EventHandler {

    public static String receiveString(String message, Scanner reader){
        System.out.println(message);
        String in = reader.next();
        return in;
    }

    public static String command(Scanner reader){
        String in = reader.next();
        return in;
    }


    public static PersonType selectUserType(String message, Scanner reader){
        System.out.println(message);
        String in = reader.next();
        if (in.equals("F")){
            return PersonType.NATURAL;
        } else if (in.equals("J")){
            return PersonType.LEGAL;
        } else {
            System.out.println("Pessoa invalida");
            return PersonType.INVALID;
        }
    }

}
