package com.chang.design.abstractFactory;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class EGM {
    private static Map<String, Object> EMGCache = new HashMap<>();

    /**
     * get
     */
    public  Object gain(String key){
        log.info("EGM get key:{}", key);
        return EMGCache.get(key);
    }

    public  void set(String key, Object value){
        log.info("EGM set key:{}, value:{}", key, value);
        EMGCache.put(key, value);
    }

    public  void delete(String key){
        log.info("EGM delete key:{}", key);
        EMGCache.remove(key);
    }

    // 其他方法
}
