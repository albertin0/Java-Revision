public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {
        // Initialize variables
        int a = 27;
        int b = 5;
        
        System.out.println("Using a = " + a + " and b = " + b);
        System.out.println("-----------------------------------");

        // 1. Addition (+) ➕
        System.out.println("Addition (a + b): " + (a + b));

        // 2. Subtraction (-) ➖
        System.out.println("Subtraction (a - b): " + (a - b));

        // 3. Multiplication (*) ✖️
        System.out.println("Multiplication (a * b): " + (a * b));

        // 4. Division (/) ➗
        // Note: This is integer division, the fractional part is discarded.
        System.out.println("Integer Division (a / b): " + (a / b));
        
        // To get a precise decimal result, cast one number to a double.
        double preciseDivision = (double) a / b;
        System.out.println("Floating-Point Division ((double) a / b): " + preciseDivision);

        // 5. Modulo (%)
        // This gives the remainder of a division.
        System.out.println("Modulo/Remainder (a % b): " + (a % b));
        
        System.out.println("-----------------------------------");

        // Unary Operators
        int c = 10;
        System.out.println("Initial value of c = " + c);
        
        // 6. Increment (++)
        c++; // c is now 11
        System.out.println("After Increment (c++): " + c);

        // 7. Decrement (--)
        c--; // c is now back to 10
        System.out.println("After Decrement (c--): " + c);
    }
}