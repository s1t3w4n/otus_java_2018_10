package app.messages;

import app.DBService;
import app.MsgToDB;
import messageSystem.Address;
import model.User;

public class MsgAdd extends MsgToDB {
    private final User user;
    public MsgAdd(Address from, Address to, User user) {
        super(from, to);
        this.user = user;
    }

    @Override
    public void exec(DBService dbService) {
        dbService.add(user);
    }
}
