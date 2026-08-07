import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo_io {
    public static void main(String[] args) throws IOException {
        System.out.println("");
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        System.out.println("enter a number");
        int num =Integer.parseInt(bf.readLine()); // can take a very long no. as input
        System.out.println("enter a string");
        String s =(bf.readLine());
        System.out.println(num+s);
        System.out.println("enter a number");
        int num1 =Integer.parseInt(bf.readLine());
        System.out.println(num1);

    }
}
