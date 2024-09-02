package chapter1;

/*
Write a short Java method that takes an integer n and returns the sum of all the
odd positive integers less than or equal to n.
 */

import java.util.Scanner;

public class ProbSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        Integer n = scanner.nextInt();
        System.out.println("Sum of all number less than " + n + " is equal to " + getSum(n) + "." );
    }
    private static Integer getSum(Integer  n) {
        Integer sum = 0;
        for (int i = 1; i <=n; i = i+2) {
            sum = sum + i;
        }
        return sum;
    }
}
