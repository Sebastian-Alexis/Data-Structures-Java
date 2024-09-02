package chapter1;
import java.util.Scanner;
/*
Write a short Java method, isEven, that takes an int i and returns true if and only
if i is even. Your method cannot use the multiplication, modulus, or division
operators, however.
 */

public class ProbFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();
        System.out.println(isEven(i));
    }
    private static boolean isEven(int i) {
        String str = String.valueOf(i);
        return (str.endsWith("2") || str.endsWith("4") || str.endsWith("6") || str.endsWith("8") || str.endsWith("0"));
    }
}
