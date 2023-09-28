public class no4 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 0},
            {4, 5, 6},
            {7, 8, 9}
        };

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[i][n - 1 - i];
        }

        int result = Math.abs(diagonalSum1 - diagonalSum2);

        System.out.println("Hasil pengurangan diagonal: " + result);
    }
}
