package src.Patterns;

public class P054_MirroredRhombusStarPattern {
    public static void main(String[] args) {

        int size = 4;

        for (int i = 0; i < size; i++) {
            for (int j = size - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < size; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
