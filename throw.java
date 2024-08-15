class hello extends Exception
{void hello(String s)
 {System.out.println(s);}
}
class throwkey
{public static void main(String[]args)
 { try
   {throw new hello("unable to print");}
   catch(Exception e)
   {System.out.println("something went wrong");}
 }
}