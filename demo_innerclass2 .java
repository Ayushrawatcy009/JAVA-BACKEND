class A{
    public void show(){
        System.out.println("in a");
    }
}
 
public class demo_innerclass2 {
    public static void main(String[] args) {
        A obj =new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}
