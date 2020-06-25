package com.novice.concurrency.example.atomatic;

import com.novice.concurrency.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

@Slf4j
@ThreadSafe
public class AtomaticExample5 {
    private static AtomicIntegerFieldUpdater<AtomaticExample5> updater =
            AtomicIntegerFieldUpdater.newUpdater(AtomaticExample5.class,"count");

    @Getter
    public volatile int count;

    private static AtomaticExample5 example5=new AtomaticExample5();
    public static void main(String[] args) {
       if (updater.compareAndSet(example5,100,120));
           log.info("update success 1,{}",example5.getCount());
        if (updater.compareAndSet(example5,100,120)){
            log.info("update success 2,{}",example5.getCount());
        }else {
            log.info("update failed,{}",example5.getCount());
        }

       // AtomicStampedReference
    }
}
