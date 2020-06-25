package com.novice.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class SynchronizedExample1 {

    //修饰一块代码
    public void test1 (int j){
        synchronized (this){
            for (int i=0;i<10;i++){
                log.info("test1 - {} -{}",j,i);
            }
        }
    }

   public synchronized  void test2(int j){
       for (int i=0;i<10;i++){
           log.info("test2 - {} -{}",j,i);
       }
   }

    public static void main(String[] args) {
        //线程池1
        SynchronizedExample1 example1=new SynchronizedExample1();

        //线程池2
        SynchronizedExample1 example2=new SynchronizedExample1();

        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(()->{
            example1.test1(1);
        });

        executorService.execute(()->{
            example2.test1(2);
        });
    }
}
