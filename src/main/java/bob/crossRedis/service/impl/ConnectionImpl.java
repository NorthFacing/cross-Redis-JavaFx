package bob.crossRedis.service.impl;

import bob.crossRedis.service.Connection;
import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisURI;

public class ConnectionImpl implements Connection {

    @Override
    public RedisClient login(String host, int port, String pswd) {
        RedisURI redisUri = RedisURI.Builder.redis(host, port)
                .withPassword(pswd)
                .withDatabase(0)
                .build();

        RedisClient client = RedisClient.create(redisUri);
        return client;
    }
}
