package bob.crossRedis.domain;

import com.lambdaworks.redis.api.StatefulRedisConnection;

public class DatabaseNode extends TreeNode<DatabaseNode> {

  private StatefulRedisConnection conn;

  public DatabaseNode(String name, StatefulRedisConnection conn) {
    super(name);
  }

  public StatefulRedisConnection getConn() {
    return conn;
  }

  public void setConn(StatefulRedisConnection conn) {
    this.conn = conn;
  }

  @Override
  public void createAndAddChild(String name, Object conn) {

    if (conn instanceof StatefulRedisConnection)
      getItems().add(new DatabaseNode(name, (StatefulRedisConnection) conn));

  }

}
