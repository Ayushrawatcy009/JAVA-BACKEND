
@FunctionalInterface
interface a{
     int add(int x,int y);
}

public class demo_sam {
    public static void main(String[] args) {
        /*a obj=new a(){
            public int add(int x, int y) {
                return x+y;
            }
        }; */

        a obj=(x, y)-> x+y;  //use of lamda expression  return isremoved x+y
                             //automatically becomes a return type 
        int result = obj.add(5,4);
        System.out.println(result);
    }
}
