enum laptop{
    macbook(100),hp(200),dell(300),thinkpad(400);  //objects
    private int price;

    private laptop(int price) {  // constructor
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    


}

public class demo_enum3 {
    public static void main(String[] args) {
        laptop lap =laptop.macbook;
        System.out.println(lap+":"+lap.getPrice());

        for(laptop lap1: laptop.values())
        {
            System.out.println(lap1+":"+lap1.getPrice());
        }
    }
    
}
