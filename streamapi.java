
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamapi {
    public static void main(String[] args) {
        List<Integer>nums= Arrays.asList(4,5,6,7,8,9,1,23,5,55);
        Stream<Integer>s1=nums.stream();

        Stream<Integer>s2=s1.filter(n->n%2==0);
        /* behind the scene working
            filter implements predicate interface[prediacte is a functional interface]
            Predicate<Integer>p= new Predicate<Integer>(){
                public boolean test(Integer n){
                    return n%2==0;
                }
            };

            using lamda expression :
            Predicate<Integer>p=  n->n%2==0;
            s1.filter(p);
        */
        Stream<Integer>s3=s2.map(n->n*2);
        /* behind the scene working
            map implements Function interface[Function is a functional interface]
            Function<Integer,Integer>fn= new Function<Integer,Integer>(){
                public integer do(Integer n){
                    return n*2;
                }
            };

            using lamda expression :
            Function<Integer,Integer>fn=n->n*2;
            s2.map(n->n*2);
        */
        /*
         single line working :
         int res= nums.stream();
                      .filter(n->n%2==0);
                      .map(n->n*2);
                      .reduce(0,(c,e)->c+e);
        */
    }
}
