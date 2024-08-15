class threads_using_extends extends Thread
{public static void main(String[]args)
{threads_using_extends  t=new threads_using_extends ();
 t.start();
 System.out.println("outside thread");
}
public void run()
{System.out.println("inside the thread");}
}