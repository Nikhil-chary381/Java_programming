import java.io.*;
import java.util.*;

class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> name=new ArrayList<>();
        ArrayList<List<Integer>> lol=new ArrayList<List<Integer>>();
        int i=0,d=0;
        int n=sc.nextInt();
        while(i<n){
        d=sc.nextInt();
        for(int j=0;j<d;j++){
            name.add(sc.nextInt());
        }
        lol.add(name);
        i++;
    
        }
        for(List l:lol)
        System.out.println(l);
        

    }
}
