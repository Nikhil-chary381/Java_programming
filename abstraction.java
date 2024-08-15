abstract class movie
{public void ntr()
{System.out.println("devara");}
 public abstract void ram();
}
class movie1 extends movie
{public void ram()
 {System.out.println("game changer");}
}
class abstraction
{public static void main(String[]args)
 {movie1 m=new movie1();
  m.ntr();
  m.ram();
}
}