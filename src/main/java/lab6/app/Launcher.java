package lab6.app;

import akka.actor.ActorSystem;

public class Launcher {

    private static final String ACTOR_SYSTEM_NAME = "anonymizer-system"

    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create();
    }
}
