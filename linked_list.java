//import java.util.LinkedList;
import java.util.*;
public class linked_list {

public static void main(String[]args){

List <String> l=new LinkedList<String>();
Scanner sc=new Scanner(System.in);
System.out.println("enter no of strings:");
int n=sc.nextInt();
sc.nextLine();
System.out.println("enter strings:");
for(int i=1;i<=n;i++)
{l.add(sc.nextLine());}
System.out.println("given strings in linked list are:");
for(String s:l)
System.out.println(s);
    
    System.out.println(l.size());
    System.out.println(l.getFirst());
     System.out.println(l.getLast());
      System.out.println(l.get(0));
      System.out.println(l.removeFirst());
       System.out.println(l);
       l.addFirst("rrr");
       l.addLast("jjjj");
       System.out.println(l);
       Collections.sort(l);

System.out.println(l);
Collections.reverse(l);
System.out.println(l);

sc.close();

}

    
}
