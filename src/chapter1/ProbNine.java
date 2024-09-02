package chapter1;
import java.util.Scanner;
/*
Write a short Java method that uses a StringBuilder instance to remove all the
punctuation from a string s storing a sentence, for example, transforming the
string "Let’s try, Mike!" to "Lets try Mike".
 */


public class ProbNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a sentence:");
        String s = scanner.nextLine();
        System.out.println(removePunct(s));


    }
    private static String removePunct (String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '\'' || stringBuilder.charAt(i) == ',' || stringBuilder.charAt(i) == '!' || stringBuilder.charAt(i) == '.' || stringBuilder.charAt(i) == '?') {
                stringBuilder.deleteCharAt(i);
            }
        }
        return stringBuilder.toString();



    }
}
