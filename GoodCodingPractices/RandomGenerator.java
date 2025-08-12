package GoodCodingPractices;

import java.util.Random;

import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        // 1. Create an instance of the Random class
        Random random = new Random();

        // 2. Generate a random integer (can be any positive or negative value)
        int randomNumber = random.nextInt();
        System.out.println("A completely random integer: " + randomNumber);

        // 3. Generate a random integer within a specific range [0 to 9]
        // nextInt(10) gives a number from 0 up to (but not including) 10.
        int randomIntFromZeroToNine = random.nextInt(10);
        System.out.println("A random integer from 0 to 9: " + randomIntFromZeroToNine);
        
        randomIntFromZeroToNine = random.nextInt(21, 99);
        System.out.println("A random integer from 21 to 98: " + randomIntFromZeroToNine);

        // 4. Generate a random integer in a custom range [1 to 100]
        // We generate a number from 0-99 and then add 1 to shift the range.
        int randomIntFromOneToHundred = random.nextInt(100) + 1;
        System.out.println("A random integer from 1 to 100: " + randomIntFromOneToHundred);

        // 5. Generate a random double (a value between 0.0 and 1.0)
        double randomDouble = random.nextDouble();
        System.out.println("A random double between 0.0 and 1.0: " + randomDouble);
        
        // 6. Generate a random boolean (true or false) 🎲
        boolean randomBoolean = random.nextBoolean();
        System.out.println("A random boolean value: " + randomBoolean);
    }
}
