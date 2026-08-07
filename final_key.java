class calc{
    public void show(){
        System.out.println("by ayush");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class Advcalc extends calc{
    public void show(){
        System.out.println("by ayush rawat");
    }
}

public class final_key{
    public static void main(String[] args) {
        Advcalc obj =new Advcalc();
        obj.show();
        obj.add(5,4);

    }
}
