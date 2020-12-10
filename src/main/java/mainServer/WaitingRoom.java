package mainServer;

public class WaitingRoom {

    private int id;
    private Team team1;
    private Team team2;
    private String city;
    private Chat chat;
    private Client host;
    private int clientsMax;
    private boolean status;

    public int getId() { return id; }
    public Team[] getTeams() { Team[] teams = new Team[]{team1, team2}; return teams; }
    public String getCity() { return city; }
    public int getHost() { return host.getId(); }
    public int getClientsLoggedVal() { return team1.clientsSize() + team2.clientsSize(); }
    public int getClientsMax() { return clientsMax; }
    public boolean getStatus() { return status; }

    public boolean joinTeam(Client client) {
        if (team1.clientsSize() <= team2.clientsSize()) {
            if (team1.joinTeam(client)) return true;
            else return  team2.joinTeam(client);
        }
        else {
            if (team2.joinTeam(client)) return true;
            else return team1.joinTeam(client);
        }
    }

    public boolean canStart() {
        if (team1.clientsSize() >= 10 && team2.clientsSize() >= 10)
            return true;
        else return false;
    }

    public boolean isHost(Client client) {if (client == host) return true; else return false;};

    public boolean changeHost() {
        if (team1.clientsSize() > 0) {
            host = team1.getFirstClient();
            return true;
        }
        else if (team2.clientsSize() > 0) {
            host = team2.getFirstClient();
            return true;
        }
        else return false;
    }

    public WaitingRoom (String city, Client host) {
        this.city = city;
        this.host = host;

        team1 = new Team();
        team2 = new Team();
        chat = new Chat();
        status = false;
    }
}
