
/* calculator 
public class claculator 
{
    public static void main(String[] args) 
    {
        int num = 10;
        int num2 = 20;
        int result = num + num2;
        System.out.println("The sum is: " + result);
        
    }
}
without objects & classes*/
class first 
{
    public int add(int num1,int num2) //var.name is same in
                                      //calling and called fn.
    {
        int r=num1 +num2;
        return r;
    }
}
public class claculator 
{
    public static void main(String[] args) 
    {
        int num = 10;
        int num2 = 20;
        first cal =new first();
        int result =cal.add(num,num2);
        System.out.println("The sum is: " + result);
        
    }
}