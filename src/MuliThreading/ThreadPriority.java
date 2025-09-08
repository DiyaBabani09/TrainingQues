package MuliThreading;

class Mythread1 extends Thread {
    Mythread1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i < 7; i++) {
            System.out.println(currentThread().getName() + "priority" +
                    currentThread().getName() + " " + i);
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1("medium priority thread");
        Mythread1 t2=new Mythread1("high priority thread");
        Mythread1 t3=new Mythread1("low priority thread");
        t1.setPriority(6);
        t2.setPriority(10);
        t3.setPriority(1);
        t1.start();

        t2.start();

        t3.start();

    }

    }

