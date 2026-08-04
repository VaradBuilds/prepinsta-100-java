package src.basics;

public class P014_NthTermInFibonacciSeries {
    public static void main(String[] args) {

        int n = 3;
        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("The " + n + "th Fibonacci term is: " + findNthFibonacci(n));
    }

    private static int findNthFibonacci(int n) {

        if (n == 1) return 0;
        if (n == 2) return 1;

        int a = 0;
        int b = 1;

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }


//    private static int findNthFibonacci(int n) {
//        if (n == 1) return 0;
//        if (n == 2) return 1;
//
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
}
