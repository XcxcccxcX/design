package com.chang.design.singleton;


/**
 * 枚举单例
 *
 */
public enum Singleton_08 {

    INSTANCE;
    public void getInstance(){
        System.out.println("enum singleton");
    }

}
