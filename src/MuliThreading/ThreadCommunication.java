package MuliThreading;

class SharedResource{
    int data;
    boolean hasdata;
    public synchronized  void produce(int value){
        while(hasdata){
            try{
                wait();
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }

        }
        data=value;
        hasdata=true;
        System.out.println("produced"+ value);
        notify();

    }
    public synchronized int  consume(){

        while(!hasdata){
            try{
wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasdata=false;
        System.out.println("Consume"+ data);
        notify();
        return data;

    }
}
class Producer implements Runnable {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}








public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();

    }
}
