package MuliThreading;
class Mythread2 extends Thread{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(currentThread().getName()+ "running" );
            Thread.yield();
        }
    }
}
public class ThreadExample3 {
    public static void main(String[] args) {
        Mythread2 t1=new Mythread2();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();

    }
}
