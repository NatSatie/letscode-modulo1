package event.actionCommands.commands.receive;

import client.Client;
import event.actionCommands.commands.CommandAction;
import event.actionCommands.enums.TransactionAction;
import transaction.CheckBalance;
import transaction.Deposit;
import transaction.Withdraw;

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
            String value = super.reader.next();
            Deposit.action(super.user, BigDecimal.valueOf(Float.parseFloat(value)));
        } else if (super.command.equals(TransactionAction.DEPOSIT.getCommand())){
            String value = super.reader.next();
            Withdraw.action(super.user, BigDecimal.valueOf(Float.parseFloat(value)));
        } else if (super.command.equals(TransactionAction.TRANSFER.getCommand())){
            System.out.println("Transferencia");
        } else if (super.command.equals(TransactionAction.INVEST.getCommand())){
            System.out.println("Investimento");
        } else if (super.command.equals(TransactionAction.OPEN_ACCOUNT.getCommand())){
            System.out.println("Abrir conta");
        } else if (super.command.equals(TransactionAction.PROFILE.getCommand())){
            System.out.println("ver perfil");
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
