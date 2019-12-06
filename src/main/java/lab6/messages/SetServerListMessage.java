package lab6.messages;

public class SetServerListMessage {

    private String[] serverList;

    public SetServerListMessage(String[] serverList) {
        this.serverList = serverList;
    }

    public String[] getServerList() {
        return serverList;
    }
}
