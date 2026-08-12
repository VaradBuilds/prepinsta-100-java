package src.Patterns;

public class P052_HollowRectangleStarPattern {
    public static void main(String[] args) {

        int l = 5, b = 3;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < l; j++) {
                if (i == 0 || i == b - 1 || j == 0 || j == l - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
