package chapter1;
import java.util.Scanner;

/*
Write a short Java method that counts the number of vowels in a given character
string.
 */

public class ProbEight {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = scanner.nextLine();
        System.out.println("There are " + countVowels(string.toLowerCase()) + " vowels in your given string.");


    }
    private static int countVowels (String string) {
        Integer vowelCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                vowelCount = vowelCount + 1;
            }
        }
        return vowelCount;
    }
}
