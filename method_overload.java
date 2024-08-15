import java.util.*;
class addition
{public int add(int a,int b)
 {return a+b;}
 public double add(double x,double y)
 {return x+y;}
 public int add(int a,int b,int c)
 {return a+b+c;}
 public double add(double x,double y,double z)
 {return x+y+z;}
}
class method_overload
{public static void main(String[]args)
 {Scanner sc=new Scanner(System.in);
  addition a=new addition();
  System.out.println(a.add(3,2));
  System.out.println(a.add(3.5,2.5));
  System.out.println(a.add(3,2,5));
  System.out.println(a.add(3.5,2.5,4.0));
  sc.close();
 }
}