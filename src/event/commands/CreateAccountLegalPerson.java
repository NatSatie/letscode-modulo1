package event.commands;

public enum CreateAccountLegalPerson{
    CHECKING("1"), INVEST("2"), ALL("3"), QUIT("0");

    private String command;

    CreateAccountLegalPerson(String command){
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
