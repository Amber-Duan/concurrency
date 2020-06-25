package com.novice.concurrency.example.singleton;

import com.novice.concurrency.annoations.NotThreadSafe;

/**
懒汉模式
*/
@NotThreadSafe
public class SingletonExample1 {
    //构造方法私有化
    private SingletonExample1(){}
    //单例对象
    private static  SingletonExample1 instancce=null;
    //静态的工厂方法
    public static SingletonExample1 getInstancce() {
        if(instancce == null)
            instancce=new SingletonExample1();
        return instancce;
    }
}
