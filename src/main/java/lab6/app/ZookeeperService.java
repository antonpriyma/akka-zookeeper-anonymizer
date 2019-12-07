package lab6.app;

import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.List;

public class ZookeeperService {

    private static final String ZOOKEEPER_CONNECT_STRING = "127.0.0.1:2181";
    private static final String ROOT_PATH = "/servers";
    private static final String NODES_PATH = "/servers/s";
    private static final int SESSION_TIMEOUT = 3000;

    private ZooKeeper zooKeeper;

    public ZookeeperService() throws IOException {
        this.zooKeeper = createZooKeeper();
    }

    private ZooKeeper createZooKeeper() throws IOException {
        return new ZooKeeper(ZOOKEEPER_CONNECT_STRING, SESSION_TIMEOUT, null);
    }

    private void createServer() {

    }

    private void watchServers() {
        List<String> servers = zooKeeper.getChildren()
    }
}
