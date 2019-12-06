package lab6.app;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.stream.ActorMaterializer;
import lab6.actors.ConfigStoreActor;

public class Launcher {

    private static final String ACTOR_SYSTEM_NAME = "anonymizer-system";

    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create(ACTOR_SYSTEM_NAME);
        ActorRef configStoreActor = system.actorOf(Props.create(ConfigStoreActor.class));

        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);
        //TODO:create server
    }
}
