package MuliThreading;
class Mythread3 extends Thread{
    public void run(){
       while(true){
           System.out.println("Hello world");
       }
    }
}
public class ThreadExample4 {
    public static void main(String[] args) {


        Mythread3 t1 = new Mythread3();
//        Mythread3 t2 = new Mythread3();
        t1.setDaemon(true);
        t1.start();


    }
}