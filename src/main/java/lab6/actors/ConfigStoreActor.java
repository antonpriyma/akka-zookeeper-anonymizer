package lab6.actors;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;
import lab6.messages.GetRandomServerMessage;
import lab6.messages.SetServerListMessage;

import java.util.Random;

public class ConfigStoreActor extends AbstractActor {

    private String[] serverList;

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().match(SetServerListMessage.class, msg -> {
            this.serverList = msg.getServerList();
        }).match(GetRandomServerMessage.class, msg -> {
            sender().tell(getRandomServer(), self());
        }).build();
    }

    private String getRandomServer() {
        return serverList[new Random().nextInt(serverList.length)];
    }
}
