package bob.crossRedis.domain;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.api.StatefulRedisConnection;

public class ConnNode {

  private String title;
  private RedisClient client;
  private StatefulRedisConnection<String, String> connect;

  public ConnNode(){
  }

  public ConnNode(String title, RedisClient client) {
    this();
    this.title = title;
    this.client = client;
  }

  public static void main(String[] args) {
    ConnNode connNode = new ConnNode(null,null);
    connNode.setTitle("test");
    System.out.println(connNode);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RedisClient getClient() {
    return client;
  }

  public void setClient(RedisClient client) {
    this.client = client;
  }

  public StatefulRedisConnection<String, String> getConnect() {
    return connect;
  }

  public void setConnect(StatefulRedisConnection<String, String> connect) {
    this.connect = connect;
  }

}
