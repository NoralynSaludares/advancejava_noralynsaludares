import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for array size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] numbers = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input target value
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(numbers, target);
        System.out.println(index != -1 ? "Element found at index " + index : "Element not found.");

        scanner.close();
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) return mid;
            else if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Element not found
    }
}
