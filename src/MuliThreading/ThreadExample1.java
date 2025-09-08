package MuliThreading;
class Test extends Thread{
    public void print(){
        for(int i=0;i<10;i++){
            System.out.println(i+ " "+ currentThread().getName());
        }
    }


}
public class ThreadExample1 {

    public static void main(String[] args) {
        Test t1=new Test();
        t1.run();
        t1.print();
    }
}
