public class OneDArray {
    public static void main(String[] args) {
             int[] grades = {84, 89, 77, 92, 88}; // Student grades array
        int sum = 0;
               for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
               double average = (double) sum / grades.length;
        System.out.println("Average Grade: " + average);
                int max = grades[0];
        int min = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        System.out.println("Maximum Grade: " + max);
        System.out.println("Minimum Grade: " + min);
               System.out.println("Reversed Array:");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.println(grades[i]);
        }
    }
}

Practices:
import java.util.Arrays;
import java.util.HashSet;

public class ArrayOperations {
    public static void main(String[] args) {
                int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
                int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        
        int[] arrayWithDuplicates = {1, 2, 2, 3, 4, 5, 5, 6};
        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);
        System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
                System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        return mergedArray;
    }
    public static int[] removeDuplicates(int[] array) {
                HashSet<Integer> set = new HashSet<>();
        
        for (int num : array) {
            set.add(num); 
        }
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        return uniqueArray;
    }
}