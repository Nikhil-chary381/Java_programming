import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(3);
        v.add(1);
        System.out.println("vector elements are :"+v);
        v.remove(4);
        System.out.println("vector elements after deletion are :"+v);
        v.set(0,5);
        System.out.println("vector elements after updation are :"+v);
        System.out.println("element at index 3:"+v.get(3));




    }
    
}
