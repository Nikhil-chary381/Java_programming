import java.util.*;
class sumn
{ public static void main(String[]args)
  { Scanner sc=new Scanner(System.in);int i=0;

    System.out.print("enter num:");
    int n=sc.nextInt();
    int sum=0;
    for(i=1;i<=n;i++)
    {sum=sum+i;}
    System.out.println("sum of"+n+"numbers is:"+sum);
    }
}