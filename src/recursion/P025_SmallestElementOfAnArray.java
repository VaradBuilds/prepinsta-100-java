package src.recursion;

public class P025_SmallestElementOfAnArray {

    public static void main(String[] args) {

        int[] arr = {90, 15, 23, 56};
        int i = 0;
        System.out.print("Smallest element is: " + findSmallestElement(arr, i));
    }

    private static int findSmallestElement(int[] arr, int i) {

        if (i == arr.length - 1)
            return arr[i];

        int smallest = findSmallestElement(arr, i + 1);
        return Math.min(arr[i], smallest);
    }
}
