package src.Patterns;

import src.utils.InputUtil;

public class P048_SquareStarPattern {

    public static void main(String[] args) {

        int size = InputUtil.readInt("Enter Size of the star square: ");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
