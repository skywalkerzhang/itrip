package org.hzdb.auth.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestRedis {

    public static void main(String[] args) {

            Jedis jedis =new Jedis("127.0.0.1",6379);

            jedis.set("username","admin");
            jedis.expire("username",15);

            jedis.close();

    }


}
