package com.novice.concurrency.example.publish;

import com.novice.concurrency.annoations.NotRecommend;
import com.novice.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NotThreadSafe
@NotRecommend
public class Escape {

    private int thisCanBeEscape = 0;

    public Escape () {
        new InnerClass();
    }

    private class InnerClass {

        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        //在对象构建未完成之前不允许发布！！
        new Escape();
    }
}
