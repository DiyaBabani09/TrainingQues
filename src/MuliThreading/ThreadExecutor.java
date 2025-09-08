package MuliThreading;

import java.util.concurrent.*;

import static java.util.concurrent.Executor.*;

public class ThreadExecutor {
    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(3);
        for(int i=1;i<=10;i++){
            int finalI =i;
            es.submit(()->{
               long result=factorial(finalI);
                System.out.println(result);
            });
        }
es.shutdown();
        ExecutorService es1= Executors.newSingleThreadExecutor();
        Future<Integer>future=es1.submit(()->4);
        System.out.println(future.get());
        es1.shutdown();
    }
}
