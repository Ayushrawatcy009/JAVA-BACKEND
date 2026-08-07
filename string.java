
public class string
{
    public static void main(String[] args) {
        String name = new String("ayr");
        System.out.println(name+","+name.hashCode());
        System.out.println(name.concat("raw"));
        System.out.println(name.charAt(0));

        //due to importance of  String class we never see this syntax
        //String name = new String("ayr");
        //insted String name ="ayush" does the work 
        // this simple syntax handles the object creation for us
        String s1="ayr";
        String s2="ayr";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        

    }
}
