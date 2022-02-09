package transaction;

import client.Client;

public class CheckBalance {
    public static void action(Client user){
        user.getBalance();
    }
}
