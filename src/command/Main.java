package command;

public class Main {

    public static void main(String[] args) {
	    Server db = new Server();

        ServerProcessing serverProcessing = new ServerProcessing();

        serverProcessing.addTransaction(new StartServer(db));
        serverProcessing.addTransaction(new StopServer(db));

        serverProcessing.processTransactions();
    }
}
