package lab6.app;

import org.apache.zookeeper.ZooKeeper;

public class ZookeeperService {

    private static final String ZOOKEEPER_CONNECT_STRING = "127.0.0.1:2181";
    private static final int SESSION_TIMEOUT = 3000;

    private ZooKeeper zooKeeper;

    public ZookeeperService() {

    }

    private ZooKeeper createZooKeeper() {
        return new ZooKeeper(ZOOKEEPER_CONNECT_STRING, SESSION_TIMEOUT)
    }
}
