class human_2
{
    private String name;
    private int age ;

    public int getage()  //GETTER
    {
        return age;
    }
    public String getname()  //GETTER
    {
        return name;
    }
    public void setname(String name)  //SETTER
    {
        this.name =name;
    }
    public void setage(int age)    //SETTER
    {
        this.age=age;
    }

    //CONSTRUCTOR  {no return type and same name as our class}
    public human_2(){   //default constructor
        age=12;
        name="ayush";
    }
    public human_2(int a,String n){   //method overloading & parameterized consturctor
        age=a;
        name=n;
    }
}

public class construct_2 {
    public static void main(String[] args) {
        human_2 obj1=new human_2();
        System.out.println(obj1.getname() +":"+obj1.getage());
        human_2 obj2=new human_2(9,"guddu");  //parameterized constructor
        System.out.println(obj2.getname() +":"+obj2.getage());
    }
}
