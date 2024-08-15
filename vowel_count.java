import java.util.*;
class vowel_count
{public static void main(String[]args)
{Scanner sc=new Scanner(System.in);
 int count=0;
 System.out.println("enter name:");
 String s=sc.nextLine();
 int l=s.length();
 for(int i=0;i<l;i++)
 {if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
   {count++;}
  }
System.out.println("no.of vowels in a given string="+count);
}
}