package com.company;

import event.EventHandler;
import event.LoginEvent;
import sketch.client.Client;
import sketch.client.person.PersonType;
import sketch.control.MessagesHandler;

import java.util.Scanner;

public class Application {
    

//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        MessagesHandler.introductionApp();
//        String userName = EventHandler.receiveString("Digite seu nome completo: ", reader);
//        String userDocument = EventHandler.receiveString("Digite o numero do documento: ", reader);
//        PersonType userType = EventHandler.selectUserType("Escreva F para pessoa física, J para pessoa jurídica: ", reader);
//
//        if (userType == PersonType.NATURAL || userType == PersonType.LEGAL){
//            Client user = new Client(userName, userDocument, userType);
//            MessagesHandler.welcomeUser(user);
//            EventHandler.receiveCommands(reader);
//        }
//    }

    public static void main(String[] args) {
        EventHandler event = new EventHandler();
        event.welcome();

    }
}