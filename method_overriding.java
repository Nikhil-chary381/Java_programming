class movie
{ public void display()
  {System.out.println("devara");}
}
class movie1 extends movie
{public void display()
  {System.out.println("game changer");}
}
class method_overriding
{public static void main(String[]args)
 {movie1 m=new movie1();
  m.display();
 }
}