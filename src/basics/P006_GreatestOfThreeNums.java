package src.basics;

import java.util.Scanner;

public class P006_GreatestOfThreeNums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number - ");
        int x = sc.nextInt();

        System.out.print("Enter Second Number - ");
        int y = sc.nextInt();

        System.out.print("Enter Third Number - ");
        int z = sc.nextInt();

        if (x == y && y == z)
            System.out.println("All numbers are equal");
        else
            System.out.println(Math.max(Math.max(x, y), z) + " is greater");


//        Another Approach without library methods

//        int greatest = x;
//
//        if (y > greatest)
//            greatest = y;
//        if (z > greatest)
//            greatest = z;
//
//        System.out.println(greatest + " is greater");

    }
}

