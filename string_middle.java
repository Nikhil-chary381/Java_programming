import java.util.*;
public class string_middle {
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        int l=s.length();
        System.out.println("middle element of string:");
        if(l%2==0)
        {
            int mid=(l-1)/2;
            System.out.println(s.charAt(mid)+""+s.charAt(mid+1));

        }
        else
        {
         int m=(l-1)/2;
         System.out.println(s.charAt(m));

        }






    }
    
}
