import java.util.ArrayList;
import java.util.Collection;

public class CollectionFunctions {
    public static void main(String[]args){
        Collection<String> al=new ArrayList<>();

        //adding elements to the collection
        al.add("apple");
        al.add("banana");
        al.add("kiwi");

        System.out.println("initial collection"+al);
        //remove specific element
        al.remove("kiwi");
        System.out.println("after removing:"+al);

        Collection<String> al_2=new ArrayList<>();
        al_2.add("orange");
        al_2.add("watermelon");
        al.addAll(al_2);
        //remove all elments present in al_2 arraylist
        al.removeAll(al_2);
        System.out.println(""+al);
    }
}
