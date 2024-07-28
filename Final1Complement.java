public class Final1Complement {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 1, 6},
            {7, 8, 1}
        };

        // Find positions of 1s on the main diagonal
        findOnesOnMainDiagonal(matrix);
    }

    public static void findOnesOnMainDiagonal(int[][] matrix) {
        int size = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < size; i++) {
            if (matrix[i][i] == 1) {
                System.out.println("1 found at position: (" + i + ", " + i + ")");
            }
        }
    }
}

