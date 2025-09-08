package MuliThreading;

import java.util.concurrent.*;

class Dependent implements Runnable{
private CountDownLatch latch;
Dependent(CountDownLatch latch){
    this.latch =latch;
}
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " Thread is runnning");
        latch.countDown();
    }
}
public class ThreadExecutable {


        public static void main(String[] args) throws ExecutionException,InterruptedException {
            int NoServicee=0;
            ExecutorService es= Executors.newFixedThreadPool(3);
            CountDownLatch c= new CountDownLatch(NoServicee);
            es.submit(new Dependent(c));
            es.submit(new Dependent(c));
            es.submit(new Dependent(c));
            c.await();
            System.out.println("Main");
            es.shutdown();

        }

    }



