public class check1 {
    public static void main(String[] args) {
        // Variables
        String name = "Ayush";
        int age = 19;
        double gpa = 8.5;

        // Print info
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // Simple loop
        System.out.println("\nCounting to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Simple method call
        int result = add(10, 20);
        System.out.println("\n10 + 20 = " + result);
    }

    // A simple method
    public static int add(int a, int b) {
        return a + b;
    }
}