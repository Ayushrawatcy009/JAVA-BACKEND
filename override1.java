//in java we can override tyhe methods of parent class
//methods of parent class are override by methods of child class 
class A{
    public void show(){
        System.out.println("in A show ");
    }
    public void config(){
        System.out.println("in A config ");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show"); //overrides A
    }
}

public class override1 {
    public static void main(String[] args) {
        B obj =new B();
        obj.show();
    }
}
