import java.util.Scanner;

public class Input {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double: ");
        String input = scanner.nextLine();
        double d = Double.parseDouble(input);
        System.out.println("$" + d);
        
        System.out.println("Enter a Double: ");
        double dou = scanner.nextDouble();
        System.out.println("double = " + d);

        System.out.println("Enter a String: ");
        String s = scanner.next();
        System.out.println("String = " + s);

        System.out.println("Enter a Integer");
        int i = scanner.nextInt();
        System.out.println("int = " + i);
        scanner.close();
    }
}