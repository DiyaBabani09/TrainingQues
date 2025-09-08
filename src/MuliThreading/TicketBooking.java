package MuliThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executor.*;

public class TicketBooking  {
    static int tickets=0;
TicketBooking(int tickets){
    this.tickets=tickets;
}
public synchronized static void increaments(){
    tickets++;
}
public static void showTickets(){
    System.out.println(tickets);
}

    public static void main(String[] args) throws ExecutionException {
        ExecutorService es= Executors.newFixedThreadPool(3);
        for(int i=1;i<=5;i++){
//         TicketBooking t=new   TicketBooking(i);
         es.submit(()->{
             increaments();
             showTickets();
         });
        }
        es.shutdown();

    }

}
