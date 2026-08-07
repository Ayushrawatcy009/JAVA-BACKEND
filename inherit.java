import tools.*;
import tools.sc_clac;

public class inherit {
    public static void main(String[] args) {
        sc_clac obj=new sc_clac();
        int r1=obj.pro(6,5);
        int r2=obj.add(6,5);
        int r3=obj.sub(6,5);
        int r4=obj.mod(60,51);
        int r5=obj.abs(60,25);
        double r6=obj.pow(2,3);
        System.out.println(r1+" "+r2+" "+r3);
        System.out.println(r4+" "+r5);
        System.out.println(r6);
        a obj2=new a();
        System.out.println(obj2.marks);
    }
} 