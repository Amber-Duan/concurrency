package com.novice.concurrency.example.atomatic;

import com.novice.concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@ThreadSafe
public class AtomaticExample4 {
    private static AtomicReference count=new AtomicReference(0);

    public static void main(String[] args) {
        count.compareAndSet(0,1);
        count.compareAndSet(0,2);//no
        count.compareAndSet(2,4);//no
        count.compareAndSet(1,3);
        count.compareAndSet(4,5);//no

        System.out.println("count..."+count);
    }
}
