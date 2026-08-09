package src.arrays;

import java.util.Arrays;

public class P029_ReverseAnArray {

    public static void main(String[] args) {

        int[] arr = {2, 6, 89, 45, 23, 74};
        int start = 0, end = arr.length - 1;

//        int[] reversedArray = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            reversedArray[i] = arr[arr.length - 1 - i];
//        }

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array : " + Arrays.toString(arr));
    }
}