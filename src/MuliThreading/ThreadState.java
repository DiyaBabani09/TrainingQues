package MuliThreading;
class Mythread extends Thread{
    public void run(){
        System.out.println("running");
        try{
            for(int i=1;i<10;i++) {
                System.out.println(i + currentThread().getName());
                Thread.sleep(1000);
            }
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Mythread t1=new Mythread();
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());
Thread.sleep(2000);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());


    }
}
