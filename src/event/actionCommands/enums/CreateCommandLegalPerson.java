package event.actionCommands.enums;

public enum CreateCommandLegalPerson {
    CHECKING("1"), INVEST("2"), ALL("3"), QUIT("0");

    private String command;

    CreateCommandLegalPerson(String command){
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
