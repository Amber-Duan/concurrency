package com.novice.concurrency.example.singleton;

import com.novice.concurrency.annoations.ThreadSafe;

/**
饿汉模式
 单例在类加载时创建
*/
@ThreadSafe
public class SingletonExample6 {
    //构造方法私有化
    private SingletonExample6(){}
    //单例对象
    private static SingletonExample6 instancce = null;

    static {
        instancce = new SingletonExample6();
    }

    public static SingletonExample6 getInstancce() {
        return instancce;
    }

    public static void main(String[] args) {
     System.out.println( getInstancce().hashCode());
     System.out.println( getInstancce().hashCode());
    }
}
