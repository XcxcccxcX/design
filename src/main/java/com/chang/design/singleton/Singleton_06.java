package com.chang.design.singleton;

/**
 * 双重校验锁  懒加载 lazy
 * 双重锁的⽅式是⽅法级锁的优化，减少了部分获取实例的耗时。
 */
public class Singleton_06 {

    private static Singleton_06 instance;

    private Singleton_06(){

    }

    public static Singleton_06 getInstance(){
        if (instance != null){
            return instance;
        }

        synchronized (Singleton_06.class){
            if (instance == null){
                instance = new Singleton_06();
            }
        }
        return instance;
    }
}
