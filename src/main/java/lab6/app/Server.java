package lab6.app;

import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

public class Server extends AllDirectives {

    public Server() {
        //TODO: add constructor
    }

    public Route createRoute() {
        return get();
    }
}
