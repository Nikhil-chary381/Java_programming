import java.util.Random;
import java.io.IOException;
import java.lang.Thread;
public class thread_random extends Thread {
    public static void main(String[]args) throws IOException{
    //Random r=new Random();
    thread_random t=new thread_random();
    t.start();
    }
     public void run()
    {  Random r=new Random();
        for(int i=0;i<5;i++){
        int random=r.nextInt(100);
        System.out.println("randomly generated number is :"+random);
        if(random%2==0)
        {System.out.println("square of number "+random+":"+random*random);}
        else
        {System.out.println("cube of number "+random+":"+random*random*random);}
        try{Thread.sleep(1000);}
        catch(InterruptedException e)
        {System.out.println(e);}
        
    }
    
    
    }
}
    

