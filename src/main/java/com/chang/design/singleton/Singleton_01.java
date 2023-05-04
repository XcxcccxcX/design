package com.chang.design.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类
 */
public class Singleton_01 {

    public static Map<String, Object> cache = new ConcurrentHashMap<>();
}
