import java.util.Scanner;

public class InputUntilExit {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
       
        String userInput;
        
       
        do {
           
            System.out.print("Enter something (type 'exit' to stop): ");
            userInput = scanner.nextLine();
            
            if (!userInput.equalsIgnoreCase("exit")) {
                System.out.println("You entered: " + userInput);
            }
            
        } while (!userInput.equalsIgnoreCase("exit"));
        
       
        System.out.println("You have exited the program.");
        
      
        scanner.close();
    }
}
