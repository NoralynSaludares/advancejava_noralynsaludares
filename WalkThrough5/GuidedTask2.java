public class MatrixAddition {
    public static void main(String[] args) {
        // Define two 2x2 matrices
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };

        // Check if matrices can be added (they must have the same dimensions)
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            // Perform matrix addition
            int[][] result = addMatrices(matrix1, matrix2);

            // Print the result
            System.out.println("Resultant Matrix after addition:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices cannot be added. They must have the same dimensions.");
        }
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Create a result matrix with the same dimensions
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Add corresponding elements of the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
