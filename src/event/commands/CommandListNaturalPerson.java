package event.commands;

public enum CommandListNaturalPerson {
    CHECKING("1"), SAVINGS("2"), INVEST("3"), ALL("4"), QUIT("0");

    private String command;

    CommandListNaturalPerson(String command){
        this.command = command;
    }

    public String getCommand() {
        return command;
    }


}
