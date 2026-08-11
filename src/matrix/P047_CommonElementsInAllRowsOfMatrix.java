package src.matrix;

public class P047_CommonElementsInAllRowsOfMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {23, 56, 8},
                {19, 8, 23},
                {23, 68, 8}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {

            int candidate = matrix[0][j];
            boolean common = true;

            for (int i = 1; i < rows; i++) {

                boolean found = false;

                for (int k = 0; k < cols; k++) {

                    if (matrix[i][k] == candidate) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    common = false;
                    break;
                }
            }
            if (common) {
                System.out.println("Common element: " + candidate);
            }
        }
    }
}