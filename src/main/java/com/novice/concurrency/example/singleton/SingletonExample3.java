package com.novice.concurrency.example.singleton;

import com.novice.concurrency.annoations.NotRecommend;
import com.novice.concurrency.annoations.NotThreadSafe;
import com.novice.concurrency.annoations.ThreadSafe;

/**
懒汉模式-可线程安全
*/
@ThreadSafe
@NotRecommend
public class SingletonExample3 {
    //构造方法私有化
    private SingletonExample3(){}
    //单例对象
    private static SingletonExample3 instancce=null;
    //静态的工厂方法:同一时间只能一个线程访问,内存开销较大
    public synchronized  static SingletonExample3 getInstancce() {
        if(instancce == null)
            instancce=new SingletonExample3();
        return instancce;
    }
}
