
class computer{
    public void  code(){ //not implementing the method therefore we can make this abstract
        
    }
}
class laptop extends computer{
    public void  code(){
        System.out.println("coding");
    }
}
class desktop extends computer{
    public void  code(){
        System.out.println("coding faster");
    }
}
class dev{
    public void app(computer lap){
        lap.code();
    }
}


public class demo_interface {
    public static void main(String[] args) {
        computer hp =new laptop();
        computer dell =new desktop();
        dev ayr = new dev();
        ayr.app(dell);
        hp.code();

    }
}
