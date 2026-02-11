package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {
    public static void main(String[]args){
        List<String>list=new ArrayList<>();
        //Adding elements in list
        list.add("Java");
        list.add("Python");
        list.add("data science");
        System.out.println(" initial arraylist:"+list);

        list.add(1,"c++");
        System.out.println("adding element at specific index:"+list);


       // list.addAll(2,list);//add all elements
        list.set(2,"c#");
        System.out.println("updating an element:"+list);

        list.addAll(1,list);//add all elements
        System.out.println("addall:"+list);

      //  list.size();
        System.out.println("size of an arraylist:"+list.size());


        for(int i=0;i<list.size();i++){
           // System.out.println(""+list);//this will iterate all the elements of arraylist not particular element
            System.out.println(list.get(i) +"");//we are using this for particular element
        }
        //System.out.println();
        //iterating through the list
        for (String s:list) {
            System.out.println("iteration :"+s);

        }
    }
}
