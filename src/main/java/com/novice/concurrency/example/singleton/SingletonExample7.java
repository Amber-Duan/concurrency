package com.novice.concurrency.example.singleton;

import com.novice.concurrency.annoations.Recommend;
import com.novice.concurrency.annoations.ThreadSafe;

/**
 * 枚举模式
 *
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {

    private  SingletonExample7 (){}

    private SingletonExample7 instance;

    public SingletonExample7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;
        private SingletonExample7 singleton;

        //JVM保证这个方法绝对只调用一遍
        Singleton(){
            singleton= new SingletonExample7();
        }

        public SingletonExample7 getInstance(){
            return singleton;
        }
    }
}
