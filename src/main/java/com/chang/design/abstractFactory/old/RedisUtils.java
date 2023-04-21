package com.chang.design.abstractFactory.old;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟缓存
 */
@Slf4j
public class RedisUtils {

    private static Map<String, Object> cache = new HashMap<>();

    /**
     * get
     */
    public Object get(String key){
      log.info("redisUtil get key:{}", key);
        return cache.get(key);
    }

    public void set(String key, Object value){
        log.info("redisUtil set key:{}, value:{}", key, value);
        cache.put(key, value);
    }

    public void del(String key){
        log.info("redisUtil del key:{}", key);
        cache.remove(key);
    }

    // 其他方法
}
