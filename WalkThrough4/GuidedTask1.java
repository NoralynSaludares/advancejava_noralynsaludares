public class LinearSearchExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 12, 8, 3, 7, 15, 6};
        
        // Element to search for
        int target = 7;

        // Perform linear search to find the element
        int index = linearSearch(numbers, target);

        // Check if the element is found or not
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Function to perform Linear Search
    public static int linearSearch(int[] array, int target) {
        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
