package command;

public class StopServer implements Command {
    private Server server;

    public StopServer(Server server) {
        this.server = server;
    }

    @Override
    public void execute() {
        this.server.stopServer();
    }
}
