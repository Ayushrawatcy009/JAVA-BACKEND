class A{
    int age;
    public void show(){
        System.out.println("in a");
    }
    class B{
        public void config(){
            System.out.println("in b config");
        }
    }

}

public class demo_innerclass {
    public static void main(String[] args) {
        A obj =new A();
        obj.show();
        A.B obj1=obj.new B();
        obj1.config();
    }
}