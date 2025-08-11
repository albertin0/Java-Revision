public class ControlLogic {
    public static void main(String[] args)  {
        int score = 85;

        if (score > 90) {
            System.out.println("Excellent!");
        } else if (score > 75) {
            System.out.println("Good job.");
        } else {
            System.out.println("Keep trying!");
        }

        // Reference type (Object)
        String greeting = "Hello";
        // Creating an object from a class
        Object myObject = new Object();
    }
}
