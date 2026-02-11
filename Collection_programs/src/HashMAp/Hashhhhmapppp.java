package HashMAp;

import java.util.HashMap;
import java.util.Scanner;

public class Hashhhhmapppp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> hm = new HashMap<>();
        System.out.println("enter the entries");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++)
        {
            int keys=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the keys:"+keys);

           String value = sc.nextLine();
           // sc.nextLine();
              System.out.println("enter the values :" + value);
            hm.put(keys, value);
        }

        //hm.put(1,"aaa");
        System.out.println("hashmap taking keys and values from user"+hm);


    }
}
