package src.Patterns;

public class P051_RectangleStarPattern {
    public static void main(String[] args) {

        int l = 5;
        int b = 3;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}