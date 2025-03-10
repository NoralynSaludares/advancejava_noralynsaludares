import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        String yourName = "Nora";  
        System.out.println("Hello, " + yourName + "!");
        double length = 5.0;   
        double width = 3.0;    
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area + " square units");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Today's date and time is: " + formattedDateTime);
    }
}