package com.chang.design.singleton;

/**
 * 懒汉 (线程安全, 不建议)
 */
public class Singleton_03 {

    private static Singleton_03 instance;

    /**
     * 构造私有
     */
    private Singleton_03(){

    }

    public Object getSomething(){
        return "";
    }

    /**
     * 但由于把锁加到⽅法上后，所有的访问都因需要锁占⽤导致资源的浪费
     * @return
     */
    public static synchronized Singleton_03 get(){
        if (instance != null){
            return instance;
        }

        // 赋值
        instance = new Singleton_03();
        return instance;
    }


}
