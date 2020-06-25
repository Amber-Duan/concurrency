package com.novice.concurrency.example.singleton;

import com.novice.concurrency.annoations.NotThreadSafe;
import com.novice.concurrency.annoations.ThreadSafe;

/**
饿汉模式
 单例在类加载时创建
*/
@ThreadSafe
public class SingletonExample2 {
    //构造方法私有化
    private SingletonExample2(){}
    //单例对象
    private static SingletonExample2 instancce=new SingletonExample2();
    //

    public static SingletonExample2 getInstancce() {
        return instancce;
    }
}
