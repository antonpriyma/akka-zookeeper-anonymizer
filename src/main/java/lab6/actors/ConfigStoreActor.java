package lab6.actors;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;
import lab6.messages.SetServerListMessage;

public class ConfigStoreActor extends AbstractActor {

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().match(SetServerListMessage.class,); //TODO: создать классы сообщений
    }
}
