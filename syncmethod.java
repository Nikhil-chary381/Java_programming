import java.lang.Thread;

public class syncmethod {
    public static void main(String[]args){
        
        sample s=new sample();
        thread1 t1=new thread1(s);
        thread2 t2=new thread2(s);
        t1.start();
        t2.start();
        
    }
    
}
class sample
{static int n;
    public synchronized void print(){
    
    for(int i=0;i<10;i++)
    {  
       n++;
    
    }
    System.out.println(n);
}

}
class thread1 extends Thread
{sample s;
    thread1(sample s)
    {
      this.s=s;
     }
     public void run()
     {
        s.print();

     }
}
class thread2 extends Thread
{sample s;
    thread2(sample s)
    {
      this.s=s;
     }
     public void run()
     {
        s.print();
        

     }
}