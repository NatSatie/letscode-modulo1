package event.actionCommands.enums;

public enum CreateCommandNaturalPerson {
    CHECKING("1"), SAVINGS("2"), INVEST("3"), ALL("4"), QUIT("0");

    private String command;

    CreateCommandNaturalPerson(String command){
        this.command = command;
    }

    public String getCommand() {
        return command;
    }


}
