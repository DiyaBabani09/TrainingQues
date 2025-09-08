package MuliThreading;

public class BankImplement {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                b.withdraw(50);
            }
        };
        Thread t1=new Thread(task,"Thread1");
        Thread t2=new Thread(task,"Thread 2");
        Thread t3 = new Thread(task, "Thread 3");
        t1.start();
        t3.start();
        t2.start();

    }
}
