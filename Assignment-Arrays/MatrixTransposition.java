public class MatrixTransposition {
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transposedArray = new int[originalArray[0].length][originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[0].length; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }

        // Display the results
        System.out.println("Original Array:");
        for (int[] row : originalArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("\nTransposed Array:");
        for (int[] row : transposedArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
