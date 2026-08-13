import java.util.*;

public class collection_2 {
    public static void main(String[] args) {
        Collection<Integer>num=new ArrayList<Integer>();
        num.add(9);num.add(19);num.add(909);
        num.add(122);num.add(922);
        for(int i :num)
            System.out.println(i);
        
        List<Integer>nums=new ArrayList<Integer>();
        nums.add(1);nums.add(2);nums.add(3);
        nums.add(5);nums.add(4);
        System.out.println(nums.getLast());
        System.out.println(nums.getFirst());
        //and many other methods
    }
}
