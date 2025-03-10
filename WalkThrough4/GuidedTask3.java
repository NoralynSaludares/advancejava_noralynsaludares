public class LinearSearchExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 12, 8, 3, 7, 15, 6};
        
        // Element to search for
        int target = 7;

        // Perform linear search to find the element
        int index = linearSearch(numbers, target);

      
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

  
    public static int linearSearch(int[] array, int target) {
        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index ofimport java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        // Declare and initialize a sorted array
        int[] numbers = {3, 5, 7, 8, 12, 15, 20};

        // Element to search for
        int target = 7;

        // Perform binary search to find the element
        int index = binarySearch(numbers, target);

        // Check if the element is found or not
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Function to perform Binary Search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        // While the search space is valid
        while (left <= right) {
            // Find the middle index
            int middle = left + (right - left) / 2;

            // Check if the target is at the middle
            if (array[middle] == target) {
                return middle; // Return the index of the found element
            }
            // If target is greater, ignore the left half
            else if (array[middle] < target) {
                left = middle + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = middle - 1;
            }
        }

        // If we reach here, the element was not found
        return -1;
    }
}
 the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
