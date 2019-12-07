package lab6.app;

import org.apache.zookeeper.ZooKeeper;

public class ZookeeperService {

    private static final String ZOOKEEPER_PATH = "127.0.0.1:2181";

    private ZooKeeper zooKeeper;

    public ZookeeperService() {

    }

    private ZooKeeper createZooKeeper() {
        return new ZooKeeper()
    }
}
