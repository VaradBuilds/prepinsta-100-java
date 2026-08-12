package src.Patterns;

public class P057_HollowPyramidStarPattern {
    public static void main(String[] args) {

        int rows = 4;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (i == 0 || i == rows - 1 || k == 0 || k == 2 * i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}