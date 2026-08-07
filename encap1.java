class person
{
    String name="AYUSH";
    private int  age=10;

    public int getage()  //GETTER
    {
        return age;
    }
    public String getname()  //GETTER
    {
        return name;
    }
    public void setname(String b)  //SETTER
    {
        name =b;
    }
    public void setage(int a)    //SETTER
    {
        age=a;
    }
}

public class encap1 
{
    public static void main(String[] args) 
    {
        person per1 = new person();
        per1.setage(10);
        per1.setname("ayush");
        System.out.println("NAME :"+per1.getname()+" AGE :"+per1.getage());

    }
}
