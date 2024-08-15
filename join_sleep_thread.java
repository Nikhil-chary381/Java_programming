import java.lang.Thread;



class threads implements Runnable
{public void run()
 {for(int i=1;i<6;i++)
  {try{Thread.sleep(500);
       System.out.println(i+"thread number"+Thread.currentThread().getName());
       }
    catch(Exception e)
    {System.out.println(e);}
  }
 }
}
class join_sleep_thread
{public static void main(String[]args)
 {threads t=new threads();
  Thread th1=new Thread(t);
  Thread th2=new Thread(t);
  Thread th3=new Thread(t);
  th1.start();
  try{th1.join();}
  catch(Exception e)
  {System.out.println(e);}
  th2.start();
  try{th2.join();}
  catch(Exception e)
  {System.out.println(e);}
  th3.start();
  try{th3.join();}
  catch(Exception e)
  {System.out.println(e);}
 }
}


