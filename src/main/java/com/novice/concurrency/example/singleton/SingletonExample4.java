package com.novice.concurrency.example.singleton;

import com.novice.concurrency.annoations.NotThreadSafe;
import com.novice.concurrency.annoations.ThreadSafe;

/**
懒汉模式
*/
@NotThreadSafe
public class SingletonExample4 {
    //构造方法私有化
    private SingletonExample4(){}

    //NotThreadSafe WHY?? JVM和CPU优化，发生指令重排

    //###一个线程
    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    //###多个线程.指令重排
    // 1、memory = allocate() 分配对象的内存空间
    // 3、instance = memory 设置instance指向刚分配的内存
    // 2、ctorInstance() 初始化对象


    //单例对象
    private static SingletonExample4 instancce=null;
    //静态的工厂方法
    public static SingletonExample4 getInstancce() {
        if(instancce == null) {//双重检查机制
            synchronized (SingletonExample4.class) {
                if (instancce == null)
                    instancce = new SingletonExample4();
            }
        }
        return instancce;
    }
}
