public class Challenge7 {
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int calculateSumMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
    public static void main(String[] args){
    /*
    Create a Java program that performs operations on a 2D matrix:
    Initialize a 2D matrix with values.
    Print the matrix.
    Find and print the sum of all elements in the matrix.
    Transpose the matrix (swap rows with columns) and print the result.
    */

        System.out.println("****************  Challenge 7: Matrix Operations ******************* ");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        int sum2 = calculateSumMatrix(matrix);
        System.out.println("Sum of Matrix Elements: " + sum2);
    }
    }
