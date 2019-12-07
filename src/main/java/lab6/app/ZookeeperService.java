package lab6.app;

import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class ZookeeperService {

    private static final String ZOOKEEPER_CONNECT_STRING = "127.0.0.1:2181";
    private static final int SESSION_TIMEOUT = 3000;

    private ZooKeeper zooKeeper;

    public ZookeeperService() throws IOException {
        this.zooKeeper = createZooKeeper();
    }

    private ZooKeeper createZooKeeper() throws IOException {
        return new ZooKeeper(ZOOKEEPER_CONNECT_STRING, SESSION_TIMEOUT, null);
    }

    private void watchServers() {
        List<>
    }
}
