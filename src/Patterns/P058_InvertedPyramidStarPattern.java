package src.Patterns;

public class P058_InvertedPyramidStarPattern {
    public static void main(String[] args) {

        int size = 5;

        for (int i = 0; i < size; i++) {

            int stars = 2 * size - 1 - 2 * i;

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
