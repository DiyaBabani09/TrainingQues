package MuliThreading;

public class ThreadLambda {
    public static void main(String[] args) {
//        Runnable t1=()->{
//            System.out.println("thread is runing"+Thread.currentThread().getName());
//        };
//        for(int i=1;i<10;i++){
//            Thread t=new Thread(t1);
//            t.start();
//
//        }
        Thread t1=new Thread(()->{
            for(int i=1;i<10;i++){
                System.out.println("hello world");
            }
        });
        t1.start();
    }

}
