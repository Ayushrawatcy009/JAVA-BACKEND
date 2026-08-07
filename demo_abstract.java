abstract class car{
    public abstract void drive();
    public void music(){
        System.out.println("play music");
    }
}
class bmw extends car{
    public void drive(){
        System.out.println("driving");
    }
}
  

public class demo_abstract{
    public static void main(String[] args) {
    car obj =new bmw();
    obj.drive();
    obj.music();
    }
}