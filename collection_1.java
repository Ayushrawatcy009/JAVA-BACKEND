import java.util.*;
 
public class collection_1{
    public static void main(String[] args) {
        Collection obj =new ArrayList();
        obj.add(6);  //yellow lines because we have not declared the type of variable obj will store
        obj.add(7);  //like in an integer array there are only integer values
        obj.add(9);     //currently these values are of object type
        obj.add(10);
        System.out.println(obj);

    }
}