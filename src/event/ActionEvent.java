package event;

import client.Client;
import client.LegalPerson;
import client.NaturalPerson;

public class ActionEvent extends EventHandler {
    protected String command;

    public ActionEvent(Client user){
        super(user);
    }

    public void showCommands(){
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

    public void verifyClientHasAccount(){
        if (super.user.getAccounts().size() == 0){
            System.out.println("**** Para usar as funcoes do aplicativo, ative sua conta ****");
            if (super.user.getClient() instanceof NaturalPerson){
                this.messageAccountNaturalPerson();
            } else if (super.user.getClient() instanceof LegalPerson){
                this.messageAccountLegalPerson();
            }
        }
    }

    public void messageAccountNaturalPerson(){
        System.out.println(
                "    Por favor digite qual conta ativar:\r\n" +
                        "[1] Conta Corrente (rendimento anual 0%)\r\n" +
                        "     - Saques, depositos, transferencias nao tem custo\r\n" +
                        "[2] Conta Poupanca (rendimento anual 1%)\r\n" +
                        "[3] Conta Investimentos (rendimento anual 3%)\r\n" +
                        "     - Contas de pessoas fisicas tem rendimento \r\n" +
                        "       menor que uma conta de pessoa juridica (2% a menos) \r\n" +
                        "[4] Todas acima \r\n" +
                        "[0] Sair \r\n"
        );
    }
    public void messageAccountLegalPerson(){
        System.out.println(
                "    Por favor digite qual conta ativar:\r\n" +
                        "[1] Conta Corrente (rendimento anual 0%)\r\n" +
                        "     - Para cada saque ou transferencia tem 0.5% de taxa\r\n" +
                        "[2] Conta Poupanca (rendimento anual 1%)\r\n" +
                        "[3] Conta Investimentos (rendimento anual 3%)\r\n" +
                        "     - Contas de pessoas juridicas tem rendimento \r\n" +
                        "       maior que uma conta de pessoa fisica (2% a mais) \r\n" +
                        "[4] Todas acima \r\n" +
                        "[0] Sair \r\n"
        );
    }
}
