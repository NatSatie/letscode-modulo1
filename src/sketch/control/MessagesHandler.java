package sketch.control;

import sketch.client.Client;
import sketch.client.person.PersonType;

public class MessagesHandler {

    public static void introductionApp(){
        System.out.println("**** Aplicativo de Banco Natália Satie ****");
        System.out.println("Temos n contas ativas.");
    }

    private static String documentType(Client user){
        if (user.getPerson().getPersonType() == PersonType.NATURAL){
            return "CPF";
        } return "CNPJ";
    }

    public static void welcomeUser(Client user){
        System.out.println("**** Bem-vindo " + user.getClientName() + " ****");
        System.out.println(MessagesHandler.documentType(user) +": " + user.getPerson().getDocument());
    }

    public static void showCommands(){
        System.out.println(
                "    Por favor digite um dos seguintes comandos:\r\n" +
                "[1] Consultar Saldo \r\n" +
                "[2] Saque \r\n" +
                "[3] Depósito \r\n" +
                "[4] Fazer Transferência \r\n" +
                "[5] Investimentos \r\n" +
                "[6] Abrir Conta \r\n" +
                "[7] Meus dados \r\n" +
                "[0] Sair \r\n"
        );
    }



}
