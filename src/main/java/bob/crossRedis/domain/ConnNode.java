package bob.crossRedis.domain;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.api.StatefulRedisConnection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor()
@ToString(of = "title", includeFieldNames = false)
public class ConnNode {

  private String title;
  private RedisClient client;
  private StatefulRedisConnection<String, String> connect;

  public ConnNode(String title, RedisClient client) {
    this();
    this.title = title;
    this.client = client;
  }

  public static void main(String[] args) {
    ConnNode connNode = new ConnNode();
    connNode.setTitle("test");
    System.out.println(connNode);
  }

}
