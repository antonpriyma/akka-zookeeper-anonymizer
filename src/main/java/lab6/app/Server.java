package lab6.app;

import akka.http.javadsl.Http;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

import java.util.concurrent.CompletionStage;

public class Server extends AllDirectives {

    private static final String URL_PARAM_NAME = "url";
    private static final String COUNT_PARAM_NAME = "count";

    private Http http;

    public Server(final Http http) {
        this.http = http;
    }

    public Route createRoute() {
        return get(() ->
                parameter(URL_PARAM_NAME, url ->
                        parameter(COUNT_PARAM_NAME, count -> {
                                    //TODO: add fetch
                                }
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> fetch(String url) {
        return http.singleRequest(HttpRequest.create(url));
    }
}
