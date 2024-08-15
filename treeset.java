import java.util.*;
public class treeset{
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(1);
        t.add(4);
        t.add(3);
        t.add(2);
        System.out.println(t);
        Iterator<Integer> i=t.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
    
        System.out.println(t.subSet(1, 3));
        System.out.println(t.descendingSet());
        System.out.println(t.headSet(4));
        System.out.println(t.tailSet(2));
        t.remove(3);
        System.out.println(t);



    }
}