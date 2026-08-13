
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//sorting

public class collection_5 {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        nums.add(10);
        nums.add(1);nums.add(320);
        nums.add(100);nums.add(101);
        Collections.sort(nums);
        System.out.println(nums);

        //sorting with our own principle
        Comparator<Integer> com=new Comparator<Integer>(){
            public int compare(Integer i ,Integer j)
            {
                if(i%10<j%10)
                    return 1;
                else
                    return -1;
            }

        };
        Collections.sort(nums,com);
        System.out.println(nums);

    }
}
