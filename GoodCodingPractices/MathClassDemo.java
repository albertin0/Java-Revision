package GoodCodingPractices;

import java.text.DecimalFormat;

public class MathClassDemo {

    public static void main(String[] args) {
        double x = 16.0;
        double y = 3.0;
        double z = -4.56;
        
        System.out.println("--- Basic Operations ---");
        // Math.max() returns the larger of two values
        System.out.println("Maximum of " + x + " and " + y + ": " + Math.max(x, y));

        // Math.min() returns the smaller of two values
        System.out.println("Minimum of " + x + " and " + y + ": " + Math.min(x, y));
        
        // Math.abs() returns the absolute (positive) value
        System.out.println("Absolute value of " + z + ": " + Math.abs(z));

        System.out.println("\n--- Exponents and Roots ---");
        // Math.pow() returns the value of the first argument raised to the power of the second
        System.out.println(y + " to the power of 2: " + Math.pow(y, 2)); // 3.0^2 = 9.0

        // Math.sqrt() returns the square root of a number
        System.out.println("Square root of " + x + ": " + Math.sqrt(x)); // √16 = 4.0

        System.out.println("\n--- Rounding Operations ---");
        // Math.round() rounds to the nearest long or int
        System.out.println(z + " rounded: " + Math.round(z)); // -4.56 rounds to -5

        // Math.ceil() (ceiling) always rounds up to the nearest integer value
        System.out.println("Ceiling of " + z + ": " + Math.ceil(z)); // -4.56 rounds up to -4.0

        // Math.floor() always rounds down to the nearest integer value
        System.out.println("Floor of " + z + ": " + Math.floor(z)); // -4.56 rounds down to -5.0

        System.out.println("\n--- Random Number ---");
        // Math.random() returns a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomNumber = Math.random() * 100; // Random number between 0 and 100
        System.out.println("A random number between 0 and 100: " + randomNumber);
        System.out.println("Random number rounded: " + Math.round(randomNumber));

        System.out.println("\n--- Scientific Constants ---");
        System.out.printf("Exact value of PI = %.3f\n", Math.PI);
        
        String formattedTAU = String.format("%.5f", Math.TAU);        
        System.out.println("Value of TAU with 5 decimal places: " + formattedTAU);

        System.out.println("Exact value of TAU = " + Math.TAU);

        DecimalFormat df = new DecimalFormat("###.####");
        System.out.println("Value of E with 3 leading digit-places and 3 decimal places: " + df.format(Math.E));

        System.out.println("Exact value of E = " + Math.E);

    }
}
