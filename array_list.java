import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter no. of strings:");
             int n=sc.nextInt();
            System.out.println("enter strings:");
            for(int i=0;i<=n;i++){
            a.add(i,sc.nextLine());
            }
            System.out.println("strings in arralist are:");
            for(int i=0;i<=n;i++)
            {System.out.println(a.get(i));}
            Collections.sort(a);

            System.out.println("in ascending order:");
            for(int i=0;i<=n;i++)
            {System.out.println(a.get(i));}
            System.out.println("arralist_size:"+a.size());

            for(int i=0;i<=n;i++)
            {System.out.println(a.get(i));}
        }
        System.out.println("arralist_size:"+a.size());
        Collections.reverse(a);
        for(int i=0;i<a.size();i++)
            {System.out.println(a.get(i));}
        a.clear();
        System.out.println(a);

        }

    }

    

