package com.chang.design.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS 线程安全
 *
 */
public class Singleton_07 {

    private static AtomicReference<Singleton_07> INSTANCE = new AtomicReference<>();

    private Singleton_07 instance;

    private Singleton_07(){

    }

    public static Singleton_07 getInstance(){
        for (;;){
            Singleton_07 instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_07());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_07.getInstance());
        System.out.println(Singleton_07.getInstance());

        Singleton_08.INSTANCE.getInstance();
        //com.chang.design.singleton.Singleton_07@5fdef03a
        //com.chang.design.singleton.Singleton_07@5fdef03a
    }
}
