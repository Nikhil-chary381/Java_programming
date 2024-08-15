class movie
  {String ntr="yamadonga";
    }

class movie1 extends movie
{public void display()
  {String ntr="";
   ntr="devara";
   System.out.println(super.ntr);
   System.out.println(ntr);
   }
 }
class superkey
{public static void main(String[]args)
 {movie1 m=new movie1();
  m.display();
  
 }
}