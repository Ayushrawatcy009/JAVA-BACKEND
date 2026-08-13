
import java.util.HashMap;
import java.util.Map;

//INTRODUCTION TO MAPS

public class collection_4 {
    public static void main(String[] args) {
        Map<String,Integer>students=new  HashMap<>();
        students.put("ayush",50);
        students.put("kira",50);
        students.put("kirito",80);
        students.put("levi",90);
        System.out.println(students);
        System.out.println(students.get("levi"));
        for(String i:students.keySet()){
            System.out.println(i+":"+students.get(i));
        }

    }
}
