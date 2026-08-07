/*
class A implements  Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/

//using  a lamda expression since runnable is a functional interface
class B implements  Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class demo_threads {
    public static void main(String[] args) {
        Runnable obj1 = ()->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
 
        Runnable obj2 =new  B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
