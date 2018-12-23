package com.genericyzh.miaosha.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author genericyzh
 * @date 2018/12/24 0:09
 */
@Configuration
public class RedisSpringConfiguration {

    @Bean
    public RedisConfig redisConfig() {
        return new RedisConfig();
    }

    @Bean
    public RedisPoolFactory redisPoolFactory(RedisConfig redisConfig) {
        return new RedisPoolFactory(redisConfig);
    }

    @Bean
    public RedisClient redisClient(RedisPoolFactory redisPoolFactory) {
        return new RedisClient(redisPoolFactory);
    }

}
