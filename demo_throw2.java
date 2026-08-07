//creation of my own exception class
class myexception extends ArithmeticException{
    public myexception(String str){
        super(str);
    }
}
public class demo_throw2 {
    public static void main(String[] args) {
        int i=2,j=0;
        try {
            j=18/i;
            if(j==9){
                throw new  myexception("i don't like 9");
            }
        } catch (myexception e) {
            j=2;
            System.out.println("default value :"+j);
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
