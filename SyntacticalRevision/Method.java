public class Method {
    /**
 * A method to calculate the sum of two integers.
 * @return The sum.
 */
    public static int add(int number1, int number2) {
        int sum = number1 + number2;
        return sum; // Returns a value of type int
    }

    public static void main(String[] args)  {
        // How to call the method
        int result = add(10, 5); // result will be 15

        System.out.println(result);
    }
}
