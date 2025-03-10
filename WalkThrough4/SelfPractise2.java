public class InsertionSortStrings {
    public static void main(String[] args) {
        // Declare and initialize an array of strings
        String[] words = {"banana", "apple", "orange", "grape", "kiwi"};

        // Perform Insertion Sort on the array
        insertionSort(words);

        // Print the sorted array
        System.out.println("Sorted Array: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Function to perform Insertion Sort on an array of strings
    public static void insertionSort(String[] array) {
        int n = array.length;

        // Traverse through elements of array from index 1
        for (int i = 1; i < n; i++) {
            String key = array[i];  // The element to be inserted
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            // Insert the key at the correct position
            array[j + 1] = key;
        }
    }
}
