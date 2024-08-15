class thread_using_implement implements Runnable
{public static void main(String[]args)
 {thread_using_implement t=new thread_using_implement();
  Thread th=new Thread(t);
  th.start();
  System.out.println("outside thread");
 }
public void run()
{ System.out.println("inside thread");}
}