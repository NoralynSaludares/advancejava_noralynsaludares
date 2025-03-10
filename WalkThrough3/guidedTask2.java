public class MaxMinArray {
    public static void main(String[] args) {
        
        int[] numbers = {85, 90, 78, 92, 88, 100, 67};

        int max = numbers[0];
        int min = numbers[0];

        
        for (int num : numbers) {
            if (num > max) {
                max = num;  
            }
            if (num < min) {
                min = num; 
        }

        
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
    }
}
