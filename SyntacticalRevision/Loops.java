public class Loops {
    public static void main(String[] args)  {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // while loop
        int count = 0;
        while (count < 3) {
            System.out.println("Count is " + count);
            count++;
        }

        // enhanced for loop (for-each)
        int[] numbers = {10, 20, 30};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
