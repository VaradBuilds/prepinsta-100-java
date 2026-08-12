package src.Patterns;

public class P053_ParallelogramStarPattern {
    public static void main(String[] args) {

        int l = 5, b = 3;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < l; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
