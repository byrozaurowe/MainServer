package mainServer;

import mainServer.logging.LoggingClient;
import mainServer.logging.LoginHandler;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ClientsCoordinator {

    private ArrayList<Client> clients;
    private ArrayList<LoggingClient> loggingClients;

    ClientsCoordinator() {
        clients = new ArrayList<Client>();
        loggingClients = new ArrayList<LoggingClient>();
    }

    public void sendTo(String name, String packetType) {
        Client client = findClientByName(name);
    }

    public void sendTo(Socket s, String packetType, Object o) {
        if(s.isClosed())
            return;

    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void verifyLoggingClient(Socket s, String name, String ip, String pass) {
        LoggingClient client = findLogClientBySocket(s);
        client.setName(name);
        client.setIpAddress(ip);
        client.setPassword(pass);
        LoginHandler.verifyIdentity(client);
    }

    public boolean connect(Socket s) {
        loggingClients.add(new LoggingClient(s));
        System.out.println("Połączono do " + s);

        return true;
    }

    Client findClientByName(String name) {
        for(Client client: clients) {
            if(client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }

    private LoggingClient findLogClientBySocket(Socket s) {
        for(LoggingClient client: loggingClients) {
            if(client.getSocket() == s) {
                return client;
            }
        }
        return null;
    }

    private Client findClientBySocket(Socket s) {
        for(Client client: clients) {
            if(client.getSocket() == s) {
                return client;
            }
        }
        return null;
    }

    public void disconnect(String name) throws IOException {
        try {
            Client client = findClientByName(name);
            System.out.println("Rozłączono " + name +": " + client.getSocket());

            client.getSocket().close();
            clients.remove(client);
        } catch (NullPointerException e) {}
    }

    public void disconnect(Socket s) throws IOException {
        try {
            Client client = findClientBySocket(s);
            System.out.println("Rozłączono " + client.getName() +": " + client.getSocket());
            client.getSocket().close();
            clients.remove(client);
        } catch (NullPointerException e) {}
    }
}
