import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
      
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

     
        int[] mergedArray = mergeArrays(array1, array2);

      
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

 
    public static int[] mergeArrays(int[] array1, int[] array2) {
        
        int[] mergedArray = new int[array1.length + array2.length];

       
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }
}
