public class HelloApp {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        // Enhanced for loop
        else {
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }
    }
}