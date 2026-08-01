package src.basics;

import java.util.Scanner;

public class P005_GreatestOfTwoNums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number - ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number - ");
        int y = sc.nextInt();

        if (x == y)
            System.out.println("Both numbers are equal");
        else
            System.out.println(Math.max(x, y) + " is greater");
    }
}
