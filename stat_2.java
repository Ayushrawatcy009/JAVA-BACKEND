class phone{  //non-static /instance methodds
    String brand;
    int price;
    static String name ;

    
    public phone()
    {
        brand ="";
        price=200;
        System.out.println("in constructor");

    }
    static {
        name ="mobile";
        System.out.println("in static block");
    }

    public void show()
    {
        System.out.println(brand +":"+price+":"+name+":");
    }

    
}


public class stat_2 {
    public static void main(String[] args) {
        phone obj1= new phone();
        obj1.brand="nokia";
        phone.name="smartphone";
        obj1.price=100;

        phone obj2= new phone();
        
    }
}
