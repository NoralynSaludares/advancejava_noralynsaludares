import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
     
        int[] numbers = {1, 2, 3, 4, 2, 5, 1, 6, 3};

  
        int[] uniqueArray = removeDuplicates(numbers);

      
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

   
    public static int[] removeDuplicates(int[] array) {
     
        Set<Integer> uniqueSet = new HashSet<>();

       
        for (int num : array) {
            uniqueSet.add(num);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;

        
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
