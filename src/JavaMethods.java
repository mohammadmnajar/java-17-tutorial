public class JavaMethods {

    public static void main(String[] args) {

        // Call the method
        sayHello("John Doe");

        int result = multiply(5, 3);
        System.out.println("The result is " + result);

    }

    // Method with one parameter and a void return type
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with 2 parameters and an integer return type
    public static int multiply(int x, int y) {
        return x * y;
    }


}
