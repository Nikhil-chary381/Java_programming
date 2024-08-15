class try_catch
{public static void main(String []args)
 {int a=10;
  int b=0;
  int c=0;
  try
  {c=a/b;System.out.println(c);}
  catch(Exception e)
  {System.out.println("you are dividing a number with zero which is undefined");}
  }
}