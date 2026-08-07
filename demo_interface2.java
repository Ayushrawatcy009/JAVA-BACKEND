
interface computer{
    void code();
}
class laptop implements computer{
    public void  code(){
        System.out.println("coding");
    }
}
class desktop implements  computer{
    public void  code(){
        System.out.println("coding faster");
    }
}
class dev{
    public void app(computer lap){
        lap.code();
    }
}

public class demo_interface2 {
    public static void main(String[] args) {
        computer hp =new laptop();
        computer dell =new desktop();
        dev ayr = new dev();
        ayr.app(dell);
        hp.code();
    }
}
