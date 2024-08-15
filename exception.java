import java.util.*;

class exception
{public static void main(String []args)
 {try (Scanner sc = new Scanner(System.in)) {
  System.out.println("enter 2 numbers:");
  int n=sc.nextInt();
  int m=sc.nextInt();
  try
  {int result=n/m;
   System.out.println("result:"+result); }
  catch(Exception e)
  {System.out.println("something went wrong");}
}
  }
}