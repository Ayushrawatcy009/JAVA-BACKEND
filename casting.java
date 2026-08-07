class a{
    public void show1(){
        System.out.println("in a");
    }
}
class b extends a{
    public void show2(){
        System.out.println("in b");
    }
}

public class casting {
    public static void main(String[] args) {
        a obj=new b();
        obj.show1();

    }
}
 