package HashSet;

import java.util.HashSet;

public class NODuplicates {
    public static void main (String[]args){
        HashSet<Integer> hs=new HashSet<>();//if using hashset there is no duplicates
        hs.add(1);
        hs.add(2);
        hs.add(2);
        System.out.println(""+hs);
    }
}
