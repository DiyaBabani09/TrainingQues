package MuliThreading;
class Counter{
    private int count=0;
//    public synchronized  void increament(){
//        count++;
//    }
    public void increament(){
        synchronized (this){
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}

class sync extends Thread{
    Counter counter;
    sync(Counter counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=1;i<=2000;i++){
            counter.increament();
        }
    }
}

public class Synchronizationn {
    public static void main(String[] args) {
        Counter c=new Counter();
        sync t1=new sync(c);
        sync t2=new sync(c);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(c.getCount());
    }
}
