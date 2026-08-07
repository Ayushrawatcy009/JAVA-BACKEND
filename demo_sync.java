class a{
    int count = 0;
    public synchronized void increment() {
        count++;
    }
}

public class demo_sync {
    public static void main(String[] args) throws InterruptedException {
        a obj =new a();
        Runnable obj1 = () ->{
            for (int i = 0; i < 10000; i++) {
                obj.increment();
            }
        };
        Runnable obj2 = () ->{
            for (int i = 0; i < 10000; i++) {
                obj.increment();
            }
        };
        Thread t1 =new Thread(obj1);
        Thread t2 =new Thread(obj2);
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println(obj.count);
    }   
}
