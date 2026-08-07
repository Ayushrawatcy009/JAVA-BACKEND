enum status{
    success,fail,loading,error;
}

//check status and print values
public class demo_enum2 {
    public static void main(String[] args) {
        status s=status.error;
        /*
        if(s==status.success)
            System.out.println("all good");
        else if(s==status.fail)
            System.out.println("failure");
        else if(s==status.loading)
            System.out.println("processing");
        else if(s==status.error)
            System.out.println("unexpected"); */
        switch(s){
            case success:
                System.out.println("all good");
                break;
            case fail:
                System.out.println("failure");
                break;
            case loading:
                System.out.println("loading");
                break;
            case error:
                System.out.println("unexpected");
                break;
            default:
                System.out.println("none");
                break;

        }
    }
} 
