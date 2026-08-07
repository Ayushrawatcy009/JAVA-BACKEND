public class demo_tryfinally {
    public static void main(String[] args) {
        int i=0,j=0;
        try {
            j=12/i;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("bye");
        }
    }   
}
