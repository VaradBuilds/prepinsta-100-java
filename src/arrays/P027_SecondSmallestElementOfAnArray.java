package src.arrays;

public class P027_SecondSmallestElementOfAnArray {

    public static void main(String[] args) {

        int[] arr = {3, 67, 89, 2, 6, 45, 4, 69, 5};
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num > first && num < second) {
                second = num;
            }
        }
        System.out.println("Second Smallest from the arraay is: " + second);
    }
}
