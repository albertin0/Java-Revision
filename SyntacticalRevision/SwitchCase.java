public class SwitchCase {
    public static void main(String[] args)  {
        
        String day = "Monday";

        // Java 14+ enhanced switch
        String dayType = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid day";
        };
        
        System.out.println(dayType);
    }
}
