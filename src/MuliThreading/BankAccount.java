package MuliThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;
    private  final Lock lock=new ReentrantLock(true);
    public synchronized void withdraw(int amount){
        try {
            if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {

                System.out.println(Thread.currentThread().getName() + "   Withdrawing     " );
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().
                                getName() + "processing with withdraw    " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println("Completing withdrwal");

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {

                        System.out.println("Lock is released");
                        lock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            }
        else{
                    System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
                }

            }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            }


    }
}
