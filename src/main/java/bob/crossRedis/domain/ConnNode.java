package bob.crossRedis.domain;

import com.lambdaworks.redis.RedisClient;

public class ConnNode extends TreeNode<ConnNode> {

  private RedisClient client;

  public ConnNode(String name, RedisClient client) {
    super(name);
    this.client = client;
  }

  public RedisClient getClient() {
    return client;
  }

  public void setClient(RedisClient client) {
    this.client = client;
  }

  @Override
  public void createAndAddChild(String name, Object client) {
    if (client instanceof RedisClient)
      getItems().add(new ConnNode(name, (RedisClient) client));
  }

}
