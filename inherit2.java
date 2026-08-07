class a{
    public a() {
        System.out.println("in a");
    }

}
class b extends a{
    public b(){   //constructor
        System.out.println("in b");
    }
    public b(int n){
        // super(); way to call constructor of super class  
        System.out.println("in b :"+n);
    }
}


public class inherit2 {
    public static void main(String[] args) {
        b obj =new b();//calling of default consrtructor
        b obj1 =new b(5); // calling of parameter constructor
    } 
}
