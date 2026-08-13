import java.util.*;

public class collection_3 {
    Set<Integer> nums = new HashSet<Integer>();
    Set<Integer> num = new TreeSet<Integer>();

    {
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(4);
    }

    {
        num.add(9);
        num.add(19);
        num.add(909);
        num.add(122);
        num.add(922);
    }

    public static void main(String[] args) {
        collection_3 c = new collection_3();
        for (int i : c.num) {
            System.out.println(i);
        }
        for (int i : c.nums) {
            System.out.println(i);
        }
    }
}