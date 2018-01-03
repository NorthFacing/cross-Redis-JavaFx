package bob.crossRedis.service;

import com.lambdaworks.redis.RedisClient;

public interface Connection {

	RedisClient login(String host, int port, String pswd);

}
