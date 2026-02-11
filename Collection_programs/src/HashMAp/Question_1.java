package HashMAp;

import java.util.HashMap;

public class Question_1 {
    public static void main(String[]args){
        HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
        hashMap.put(1,"ruchi");
        hashMap.put(2,"prachi");
        hashMap.put(3,"shanu");
        hashMap.put(4,"sanju");
        hashMap.put(5,"prachi");

        System.out.println("adding an element in hashmap:"+hashMap);
        System.out.println("returns the set of allKeys :"+hashMap.keySet());
        System.out.println("returns the set of allKeys :"+hashMap.values());

        System.out.println("getting an element:"+hashMap.get(3));
        System.out.println("removing key and value:"+hashMap.remove(5));
        System.out.println("cnatians the key :"+hashMap.containsKey(1)+" "+hashMap.containsValue("ruchi"));
        System.out.println("returns the set of allKeys :"+hashMap.keySet());
        System.out.println("returns the set of allKeys :"+hashMap.values());


    }
}
