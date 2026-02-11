package HashSet;
import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctInarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size an array:");
        int n=sc.nextInt();

        int[]a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();

//        for (int i = 0; i < n; i++) {
//            hs.add(a[i]);
//        }
        for (int num:a) {
            hs.add(num);

        }

        System.out.println("Number of distinct elements: " + hs.size());//used to count unique element
        System.out.println("Distinct elements: " + hs);



    }
}
