package event.actionCommands.enums;

public enum TransactionAction {
    CHECK_BALANCE("1"), WITHDRAW("2"), DEPOSIT("3"),
    TRANSFER("4"), INVEST("5"), OPEN_ACCOUNT("6"), PROFILE("7") , QUIT("0");

    private String command;

    TransactionAction(String command){
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}

