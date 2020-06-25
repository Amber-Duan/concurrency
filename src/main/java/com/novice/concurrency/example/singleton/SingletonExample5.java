package com.novice.concurrency.example.singleton;

import com.novice.concurrency.annoations.NotThreadSafe;
import com.novice.concurrency.annoations.ThreadSafe;

/**
懒汉模式
*/
@ThreadSafe
public class SingletonExample5 {
    //构造方法私有化
    private SingletonExample5(){}

    //###一个线程
    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    //volatile+双重检测机制-->禁止指令重排
    private volatile  static SingletonExample5 instancce=null;

    //静态的工厂方法
    public static SingletonExample5 getInstancce() {
        if(instancce == null) {//双重检查机制
            synchronized (SingletonExample5.class) {
                if (instancce == null)
                    instancce = new SingletonExample5();
            }
        }
        return instancce;
    }
}
