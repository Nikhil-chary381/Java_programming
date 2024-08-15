import java.util.ArrayList;

import java.util.Scanner;

public class count_elements_list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<String>();
        ArrayList<String> temp=new ArrayList<String>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.nextLine());
        }
        /*for(int i=0;i<n;i++){
            if(temp.contains(a[i])){
                continue;
            }
            else{
                temp.add(a[i]);
            }
        }*/
        //System.out.println(a);
        System.out.println(temp);
        sc.close();
    }
    
}
