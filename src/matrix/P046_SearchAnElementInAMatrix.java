package src.matrix;

public class P046_SearchAnElementInAMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{23, 56, 8}, {19, 37, 11}, {78, 68, 44}};
        int element = 6;
        int m = 3, n = 3;
        boolean flag = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == element) {
                    flag = true;
                    System.out.printf("Element is found at (%d, %d) position", i, j);
                    break;
                }
            }
            if (flag) break;
        }
        if (!flag) System.out.print("Element Not Found.");
    }
}