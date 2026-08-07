enum status{       //status is a class
    running,failed,pending,success; //objects or named constants
                                    //objects of status
}


public class demo_enum {
    public static void main(String[] args) {
        status s=status.running;
        System.out.println(s); //Status here is datatype(or reference) and s is variable
        System.out.println(s.ordinal());
    }
}
