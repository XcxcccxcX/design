package com.chang.design.abstractFactory.old;

public interface CacheService {

    void set(String key, Object value, Integer redisType);
    Object get(String key, Integer redisType);
    void del(String key, Integer redisType);
}
