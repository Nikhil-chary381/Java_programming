import java.util.*;
import java.io.*;
public class arraylisthacker{
    public static void fun(ArrayList<String> a){
        Iterator i=a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }

    }
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("###");
        al.add("hello");
        al.add("world");
        fun(al);
        
    }
}