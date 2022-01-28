package command;

public class StartServer implements Command {
    private Server server;

    public StartServer(Server server) {
        this.server = server;
    }

    @Override
    public void execute() {
        this.server.startServer();
    }
}
