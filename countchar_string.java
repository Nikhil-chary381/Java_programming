import java.util.*;
public class countchar_string {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s="";
    System.out.println("enter string:");
    s=sc.nextLine();
    int l=s.length();
    int count[]=new int[256];
    for(int i=0;i<l;i++)
    {
       count[(int)s.charAt(i)]++;
    }
    for(int i=0;i<256;i++)


    { if(count[i]!=0)
        System.out.println((char)i+"="+count[i]);  }
        sc.close();
    }
    
    
}
