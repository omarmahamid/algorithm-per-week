package algorithm.every.week.foocuncurrency;

import java.util.concurrent.CountDownLatch;

public class Foo{

    private final CountDownLatch latch1;
    private final CountDownLatch latch2;

    public Foo(){
        latch1 = new CountDownLatch(1);
        latch2 = new CountDownLatch(1);
    }

    void first(Runnable printFirst){
        printFirst.run();
        latch1.countDown();
    }

    void second(Runnable printSecond) throws InterruptedException {
        latch1.await();
        printSecond.run();

        latch2.countDown();
    }

    void third(Runnable printThird) throws InterruptedException {
        latch2.await();

        printThird.run();
    }
}
