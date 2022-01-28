package command;

import java.util.ArrayList;
import java.util.List;

public class ServerProcessing {
    private List<Command> commands = new ArrayList<>();

    public void addTransaction(Command command) {
        commands.add(command);
    }

    public void processTransactions() {
        for(Command command : this.commands) {
            command.execute();
        }
        commands.clear();
    }
}
