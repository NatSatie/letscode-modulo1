package event.actionCommands.commands.receive;

import client.Client;
import client.NaturalPerson;
import com.company.AppSystem;
import event.actionCommands.commands.CommandAction;
import event.actionCommands.commands.create.CreateAccountLegalPerson;
import event.actionCommands.commands.create.CreateAccountNaturalPerson;
import event.actionCommands.enums.TransactionAction;
import transaction.CheckBalance;
import transaction.invest.Invest;
import transaction.transation.Deposit;
import transaction.transation.Withdraw;
import transaction.transfer.Transfer;

import java.math.BigDecimal;

public class ReceiveCommand extends CommandAction {
    public ReceiveCommand(Client user){
        super(user);
    }

    @Override
    public void action(){
        this.message();
        super.receiveInput();
        if (super.command.equals(TransactionAction.CHECK_BALANCE.getCommand())){
            CheckBalance.action(super.user);
        } else if (super.command.equals(TransactionAction.WITHDRAW.getCommand())){
            System.out.println("    Digite o valor sacado: ");
            String value = super.reader.next();
            Deposit.action(super.user, BigDecimal.valueOf(Float.parseFloat(value)));
        } else if (super.command.equals(TransactionAction.DEPOSIT.getCommand())){
            System.out.println("    Digite o valor depositado (sera depositado na conta corrente): ");
            String value = super.reader.next();
            Withdraw.action(super.user, BigDecimal.valueOf(Float.parseFloat(value)));
        } else if (super.command.equals(TransactionAction.TRANSFER.getCommand())){
            System.out.println("**** Selecione o tipo de transferencia ****");
            System.out.println(
                            " [1] Transferir para conta poupanca \r\n" +
                            " [2] Transferir para outra pessoa \r\n" +
                            " [0] Sair \r\n"
            );
            String action = super.reader.next();
            if (action.equals("1") && super.user.getClient() instanceof NaturalPerson){
                System.out.println("    Digite o valor da transferencia (sera depositado na conta corrente): ");
                String value = super.reader.next();
                Transfer.toSavings(super.user, BigDecimal.valueOf(Float.parseFloat(value)));
            } else if (action.equals("2")){
                System.out.println("    Digite o numero do documento do usuario: ");
                String target = super.reader.next();
                Client userReceiver = AppSystem.searchUser(target);
                if (userReceiver != null){
                    System.out.println("    Digite o valor da transferencia (sera depositado na conta corrente de "+
                            userReceiver.getClient().getName()+
                            "): ");
                    String value = super.reader.next();
                    Transfer.toSomeoneElse(super.user, userReceiver, BigDecimal.valueOf(Float.parseFloat(value)));
                } else {
                    System.out.println("---- Erro na transferencia! Tente novamente mais tarde ----");
                    super.exit();
                    return;
                }
            } else {
                super.exit();
                return;
            }
        } else if (super.command.equals(TransactionAction.INVEST.getCommand())){
            System.out.println("    Digite o valor a investir (sera depositado na conta investimento): ");
            String value = super.reader.next();
            Invest.action(super.user, BigDecimal.valueOf(Float.parseFloat(value)));
        } else if (super.command.equals(TransactionAction.OPEN_ACCOUNT.getCommand())){
            if (super.user.getClient() instanceof NaturalPerson){
                new CreateAccountNaturalPerson(super.user).action();
            } else {
                new CreateAccountLegalPerson(super.user).action();
            }
        } else if (super.command.equals(TransactionAction.PROFILE.getCommand())){
            System.out.println("    Nome: " + super.user.getClient().getName());
            System.out.println("    Numero do documento: " + super.user.getClient().getDocument());
        } else if (super.command.equals(TransactionAction.QUIT.getCommand())){
            super.exit();
            return;
        }
        this.action();
    }

    @Override
    public void message(){
        System.out.println("**** Por favor digite um dos seguintes comandos ****");
        System.out.println(
                " [1] Consultar Saldo \r\n" +
                " [2] Saque \r\n" +
                " [3] Depósito \r\n" +
                " [4] Fazer Transferência \r\n" +
                " [5] Investimentos \r\n" +
                " [6] Abrir Conta \r\n" +
                " [7] Meus dados \r\n" +
                " [0] Sair \r\n"
        );
    }
}
