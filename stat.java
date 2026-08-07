class mobile{  //non-static /instance methodds
    String brand;
    int price;
    static String name ;

    public void show()
    {
        System.out.println(brand +":"+price+":"+name+":");
    }

    public static void show1(mobile dbj)
    {
        System.out.println("INSIDE the  static fn.");
        System.out.println(dbj.brand +":"+dbj.price+":"+name+":");

    }
}


public class stat {
    public static void main(String[] args) {
        mobile obj1= new mobile();
        obj1.brand="nokia";
        mobile.name="smartphone";
        obj1.price=100;

        mobile obj2= new mobile();
        obj2.brand="samsung";
        mobile.name="dabba";
        obj2.price=10;
        obj1. show();
        obj2.show();

        mobile.show1(obj1);
    }
}
