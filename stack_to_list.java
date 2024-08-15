import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class stack_to_list {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(10);
        s.push(90);
        System.out.println("elements in stack are"+s);
        System.out.println("top element in stack:"+s.peek());
        List<Integer> l=s.stream().collect(Collectors.toList());
        System.out.println("elements in the list:"+l);

        System.out.println(l.getLast());
    }
    
}
