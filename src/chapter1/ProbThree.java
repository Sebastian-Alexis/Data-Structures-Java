package chapter1;
import java.util.Scanner;

/*
Write a short Java method, isMultiple, that takes two long values, n and m, and
returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 */

public class ProbThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value");
        Long n = Long.valueOf(scanner.nextLine());
        System.out.println("Enter m value");
        Long m = Long.valueOf(scanner.nextLine());
        System.out.println("Enter i value");
        Long i = Long.valueOf(scanner.nextLine());

        System.out.println(isMultiple(m, n , i));
    }
    private static boolean isMultiple (Long m, Long n, Long i) {
        return (n == m*i);
    }
}
