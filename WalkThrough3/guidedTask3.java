public class ReverseArray {
    public static void main(String[] args) {
       
        int[] numbers = {1, 2, 3, 4, 5};

     
        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

      
        int[] reversedArray = new int[numbers.length]; 
        int j = 0; // Index for the reversed array

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedArray[j] = numbers[i]; // Assign elements in reverse order
            j++; 

        
        System.out.print("\nReversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
