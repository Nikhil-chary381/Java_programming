interface movie
{public void ntr();
 public void ram();
 public void rajamouli();
}
class display implements movie
{public void ntr()
 {System.out.println("devara");}
 public void ram()
 {System.out.println("game changer");}
 public void rajamouli()
 {System.out.println("bahubali");}
}
class java_interface
{public static void main(String[]args)
 {display d=new display();
  d.ntr();
  d.ram();
  d.rajamouli();
 }
}