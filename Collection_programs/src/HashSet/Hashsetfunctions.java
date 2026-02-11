package HashSet;

import java.util.HashSet;

public class Hashsetfunctions {
    public static void main(String[]args){
        HashSet<String> people=new HashSet<>();
        people.add("aman");
        people.add("krishna");
        people.add("yash");
        people.add("ashish");
        people.add("nandan");
        people.add("nandan");

        System.out.println("adding the people in hashset:"+people);
        people.remove("yash");
        System.out.println("removing the element from the hashset:"+people);
       // people.contains("aman");
        System.out.println("possible if the name is present:"+people.contains("aman"));
        System.out.println("if possible it will show:"+people.contains("ruchi"));
       System.out.println(""+ people.size());

    }
}
