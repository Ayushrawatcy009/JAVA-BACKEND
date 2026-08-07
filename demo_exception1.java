public class demo_exception1 {
    public static void main(String[] args) {
        int i=0,j=0;
        try {
            j=18/i;
        } catch (Exception e) {
            System.out.println("error...."+e);  //executes only when there is an error
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
