import java.util.*;
//import java.util.Collections;
//import java.util.stream.Collectors;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(10);
        s.push(90);
        System.out.println("elements in stack are"+s);
        System.out.println("top element in stack:"+s.peek());
        s.pop();
        System.out.println("stack after pop:"+s);
        s.pop();
        System.out.println(s);










    }
    
}
