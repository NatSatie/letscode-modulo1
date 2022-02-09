package event.actionCommands.commands.create;

import java.math.BigDecimal;

public interface CreateAccountInterface {
    public void createCheckingAccount();
    public void createSavingsAccount(BigDecimal percentage);
    public void createInvestAccount(BigDecimal percentage);
}
