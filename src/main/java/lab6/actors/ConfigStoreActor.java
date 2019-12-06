package lab6.actors;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;
import lab6.messages.GetRandomServerMessage;
import lab6.messages.SetServerListMessage;

public class ConfigStoreActor extends AbstractActor {

    private String[] serverList;

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().match(SetServerListMessage.class, msg -> {
            //TODO: подкрутить логгер
            this.serverList = msg.getServerList();
        }).match(GetRandomServerMessage.class, msg -> {
            
        }).build(); //TODO: создать классы сообщений
    }
}
