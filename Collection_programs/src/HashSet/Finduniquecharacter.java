package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Finduniquecharacter {
    public static void main(String[] args) {

        // String s = "programming";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string:");

        String a = sc.nextLine();

        HashSet<Character> hs = new HashSet<Character>();


        for (int i = 0; i < a.length(); i++) {
            hs.add(a.charAt(i));
        }
        System.out.println("" + hs);
    }
}