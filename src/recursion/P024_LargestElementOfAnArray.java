package src.recursion;

public class P024_LargestElementOfAnArray {

    public static void main(String[] args) {

        int[] arr = {90, 15, 23, 56, 9};
        int i = 0;
        System.out.print("Largest element is: " + findLargestElement(arr, i));
    }

    private static int findLargestElement(int[] arr, int i) {

        if (i == arr.length - 1) {
            return arr[i];
        }
        int largest = findLargestElement(arr, i + 1);
        return Math.max(arr[i], largest);
    }

//    private static int findLargestElement(int[] arr) {
//
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (max > arr[i])
//                max = arr[i];
//        }
//        return max;
//    }
}
