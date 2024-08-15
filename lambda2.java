//import java.util.*;

@FunctionalInterface
interface A
{
    void string(String s);
}
public class lambda2
{public static void main(String[] args) {
    A j=(String s)->{
        if(s.isEmpty())
         System.out.println("string is empty");
         else
         System.out.println("string is not empty");
    };

j.string("hello");
//j.string("");



}

}