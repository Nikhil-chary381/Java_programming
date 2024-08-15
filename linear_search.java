import java.util.*;
class linear_search

{public static void main(String []args)
{int[] a=new int[20];int c=0,i=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter size of array:");
 int n=sc.nextInt();
 System.out.println("enter elements of array:");
 for(i=0;i<n;i++)
 {a[i]=sc.nextInt();}
 
 System.out.print("enter target element:");
 int target=sc.nextInt();
 for(i=0;i<n;i++)
 {if(a[i]==target)
 {c=1;break;}}
 if(c==1)
{ System.out.println("found at pos:"+(i+1));}
else
{System.out.println("not found");}

}

}

 
