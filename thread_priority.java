import java.lang.Thread;import java.io.*;

class thread extends Thread
{ public void run()
    { for(int i=1;i<6;i++)
        {try{Thread.sleep(100);
            System.out.println(i+"thread priority:"+Thread.currentThread().getPriority()); 
        }
        catch(Exception e)
        {System.out.println(e);}
        
        }


    }
}
public class thread_priority {

    public static void main(String[] args) {
        thread t1=new thread();
        thread t2=new thread();
        thread t3=new thread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(t3.getPriority()-3);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        try{t1.join();}catch(Exception e){System.out.println(e);}
        t2.start();
        try{t2.join();}catch(Exception e){System.out.println(e);}
        t3.start();
        try{t3.join();}catch(Exception e){System.out.println(e);}
    }
}