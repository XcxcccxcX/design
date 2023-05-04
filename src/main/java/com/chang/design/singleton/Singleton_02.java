package com.chang.design.singleton;

/**
 * 懒汉 (线程不安全)
 */
public class Singleton_02 {

    private static Singleton_02 instance;

    /**
     * 构造私有
     */
    private Singleton_02(){

    }

    /**
     * lazy
     * @return
     */
    public static Singleton_02 get(){
        if (instance != null){
            return instance;
        }

        // 赋值
        instance = new Singleton_02();
        return instance;
    }


}
