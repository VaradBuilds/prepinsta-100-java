package src.arrays;

import java.util.Arrays;

public class P031_SortAnArray {

    public static void main(String[] args) {

        int[] arr = {50, 64, 89, 2, 7, 46, 11, 32,};
        int l = arr.length;

//      Bubble Sort
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
