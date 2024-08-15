import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
//import java.util.Stack;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class deque_to_list {
    public static void main(String[] args) {
        
     Deque<Integer> s=new ArrayDeque<Integer>();
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(10);
        s.push(90);
        System.out.println("elements in deque are"+s);
        System.out.println("top element in deque:"+s.peek());
        s.pop();
        System.out.println("stack after pop:"+s);
        List<Integer> l=s.stream().collect(Collectors.toList());
        System.out.println("list elements are:"+l);
        System.out.println(l.getLast());
        l.add(88);
        System.out.println("list elements after adding are:"+l);
        















    }
    
}
