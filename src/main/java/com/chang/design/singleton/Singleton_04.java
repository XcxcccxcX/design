package com.chang.design.singleton;

/**
 * 饿汉 (线程安全, 无论是否需要用到 都会加载,)
 */
public class Singleton_04 {

    private static Singleton_04 instance = new Singleton_04();

    /**
     * 构造私有
     */
    private Singleton_04(){

    }

    public Object getSomething(){
        return "";
    }

    public static Singleton_04 getInstance(){
        return instance;
    }
}
