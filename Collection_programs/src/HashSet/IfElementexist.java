package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class IfElementexist {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String:");
        String element= sc.nextLine();

        Scanner sc_1=new Scanner(System.in);
        System.out.println("taking the element from user");
        char el=sc_1.next().charAt(0);//charAt(0)user jo bhi likhe uska pehla character leta h
        HashSet<Character>hs=new HashSet<Character>();
        for (int i = 0; i < element.length(); i++) {
            hs.add(element.charAt(i));
            // System.out.println("element that exist or not" +hs.contains(el));
        }
        System.out.println("element that exist or not:" +hs.contains(el));
    }
}
