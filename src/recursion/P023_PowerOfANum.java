package src.recursion;

import src.utils.InputUtil;

public class P023_PowerOfANum {

    public static void main(String[] args) {

        int num = InputUtil.readInt("Enter a Number: ");
        int power = InputUtil.readInt("Enter the Power: ");

        System.out.printf("Result of %d to the power of %d is %d", num, power, calculatePower(num, power));
    }

    private static int calculatePower(int num, int power) {

        if (power == 0)
            return 1;
        
        return num * calculatePower(num, power - 1);
    }
}
