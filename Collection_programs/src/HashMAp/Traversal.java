package HashMAp;

import java.util.HashMap;
import java.util.Scanner;

public class Traversal {
    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the key values from user");
//        int a=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,101);
        hm.put(2,101);
        hm.put(3,101);
        hm.put(4,101);
        // Iterate the map using for-each loop
        for (HashMap.Entry<Integer, Integer> e : hm.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());

        }
       // System.out.println(""+a);

    }


