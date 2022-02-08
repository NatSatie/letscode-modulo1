package sketch.control;

import sketch.account.Action;
import sketch.client.Client;

public class Event {
    private Client user;

    public Event(Client user){
        this.user = user;
    }

    public void next(Action action){
        return;
    }
}
