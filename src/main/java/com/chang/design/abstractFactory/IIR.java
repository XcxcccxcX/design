package com.chang.design.abstractFactory;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class IIR {
    private static Map<String, Object> IIRCache = new HashMap<>();

    /**
     * get
     */
    public  Object select(String key){
        log.info("IIR get key:{}", key);
        return IIRCache.get(key);
    }

    public  void put(String key, Object value){
        log.info("IIR set key:{}, value:{}", key, value);
        IIRCache.put(key, value);
    }

    public  void remove(String key){
        log.info("IIR delete key:{}", key);
        IIRCache.remove(key);
    }

    // 其他方法
}
