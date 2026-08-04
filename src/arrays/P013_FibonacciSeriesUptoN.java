package src.arrays;

import java.util.ArrayList;
import java.util.List;

public class P013_FibonacciSeriesUptoN {
    public static void main(String[] args) {

        int n = 3;
        System.out.println(findFibonacciSeriesUptoN(n));
    }

    private static List<Integer> findFibonacciSeriesUptoN(int n) {

        List<Integer> list = new ArrayList<>();
        if (n <= 0) {
            return list;
        }
        if (n >= 1) {
            list.add(0);
        }
        if (n >= 2) {
            list.add(1);
        }

        int a = 0;
        int b = 1;

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            list.add(next);
            a = b;
            b = next;
        }
        return list;
    }
}
