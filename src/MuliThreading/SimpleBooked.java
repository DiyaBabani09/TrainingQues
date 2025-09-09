package MuliThreading;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SimpleBooked {
     static  int availableTicket;
    SimpleBooked(int availableTicket){
        this.availableTicket=availableTicket;
    }
    public static synchronized void booked(int cust){
        availableTicket--;
    }
    public  static void showTickets(){
        System.out.println(availableTicket);
    }

    public static void main(String[] args) throws  InterruptedException {
        int Customer=5;
        SimpleBooked s=new SimpleBooked(15);
        ExecutorService es= Executors.newFixedThreadPool(3);
        IntStream.range(1,Customer+1).forEach(i->es.submit(()->{
            SimpleBooked.booked(i);
        }));
        es.shutdown();
        es.awaitTermination(1, TimeUnit.MILLISECONDS);
        showTickets();

    }
}
