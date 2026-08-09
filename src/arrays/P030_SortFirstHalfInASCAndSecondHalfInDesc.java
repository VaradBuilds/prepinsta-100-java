package src.arrays;

import java.util.Arrays;

public class P030_SortFirstHalfInASCAndSecondHalfInDesc {

    public static void main(String[] args) {

        int[] arr = {33, 78, 67, 90, 6, 45, 11};

        int n = arr.length;
        int mid = n / 2;

        // First half → Ascending
        for (int i = 0; i < mid - 1; i++) {
            for (int j = 0; j < mid - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Second half → Descending
        for (int i = mid; i < n - 1; i++) {
            for (int j = mid; j < n - 1 - (i - mid); j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}