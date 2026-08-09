package src.arrays;

import src.utils.InputUtil;

public class P028_SumOfElementsInAnArray {

    public static void main(String[] args) {

        int length = InputUtil.readInt("Enter the Length of the array: ");
        int[] arr = new int[length];
        System.out.println("Enter elements");
        for (int i = 0; i < length; i++) {
            arr[i] = InputUtil.readInt("");
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }

        System.out.print("Sum of elements = " + sum);
    }
}
