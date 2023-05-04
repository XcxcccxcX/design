package com.chang.design.singleton;

/**
 * 类的静态内部类实现单例
 *
 * 使⽤类的静态内部类实现的单例模式，既保证了线程安全有保证了懒加载，同时不会因为加锁的⽅
 * 这主要是因为JVM虚拟机可以保证多线程并发访问的正确性，也就是⼀个类的构造⽅法在多线程环境下可以被正确的加载
 * 式耗费性能。
 */
public class Singleton_05 {

    public static class Singleton_005{
        private static Singleton_005 instance = new Singleton_005();
    }

    private Singleton_05(){

    }

    public static Singleton_005 getInstance(){
        return Singleton_005.instance;
    }

}
