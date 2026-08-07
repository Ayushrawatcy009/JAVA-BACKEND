class computer
{
    public void playmusic()
    {
        System.out.println("play music");
    }
    public String rungame()
    {
        return "game running";
    }
}
//designing a class and its fn.
//behaviours: run games,music


public class methods1
{
    public static void main(String[] args) 
    {
        computer comp = new computer(); //creation of obj.of computer class
        comp.playmusic();
        String str =comp.rungame();
          
        System.err.println(str);
    }
}
