import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){

        
        ArrayList<Integer> l1=new ArrayList<Integer>();
        try(Scanner sc=new Scanner(System.in)){int index,ele;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        l1.add(i,sc.nextInt());
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {String a=sc.nextLine();
        if(a=="Insert")
        {index=sc.nextInt();
        ele=sc.nextInt();
        l1.add(index,ele);
        }
        else
        {ele=sc.nextInt();
        l1.remove(ele);
        }
        }
    }
        System.out.println(l1); 
        
    }
    
}
