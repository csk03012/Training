package Assignment3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input String1: ");
        String s1 = input.nextLine();
        System.out.print("Input String2: ");
        String s2 = input.nextLine();
        // Finding if s1 and s2 are anagram of each other.
        // removing spaces and punctuation.
        String regex = "[^A-Za-z1-9]+";
        s1 = s1.replaceAll(regex, "").toLowerCase();
        s2 = s2.replaceAll(regex, "").toLowerCase();

        // without sorting it can be done counting the frequency of each characters in string
        // by maintaining two frequency arrays.
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        s1 = String.valueOf(c1);
        s2 = String.valueOf(c2);

        if (s1.equals(s2))
            System.out.println("Both string are ANAGRAM of each other.");
        else
            System.out.println("Both Strings are NOT ANAGRAM of each other");

    }
}
