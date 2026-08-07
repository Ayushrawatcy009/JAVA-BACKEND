class human
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
    public human(){
        age=12;
        name="ayush";
    }
}

public class construct
{
    public static void main(String[] args) {
        human obj1=new human();
        System.out.println(obj1.getname() +":"+obj1.getage());
        human obj2=new human();
        System.out.println(obj2.getname() +":"+obj2.getage());
    }
}
 