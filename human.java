public class human {
    private String name;
    private int age;

    public int getage() { return age; }
    public String getname() { return name; }
    public void setname(String name) { this.name = name; }
    public void setage(int age) { this.age = age; }

    public human() {
        age = 12;
        name = "ayush";
    }
    public human(int a, String n) {
        age = a;
        name = n;
    }
}