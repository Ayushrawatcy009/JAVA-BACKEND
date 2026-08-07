public class arrayprog2 
{
    public static void main(String args[])
    {
        int num[][]=new int[3][3];  
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(num[i][j]);
            }
            System.out.println(" ");
        }

        //ENHANCED FOR LOOPS
        for(int a[] : num)
        {
            for(int b : a)
            {
                System.out.print(b +" ");
            }
            System.out.println(" ");
        }
    }
}
