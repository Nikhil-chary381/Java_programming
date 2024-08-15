import java.util.*;
public class decimaltobinary
{public static void main(String[] args) {
    int bin[]=new int[100];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter decimal number:");
    int d=sc.nextInt();
    int quo=d;
    int i=0;
    while(quo!=0)
    {
        bin[i++]=quo%2;
        quo=quo/2;

    }
    System.out.println("required binary number is:");
    for(int j=i-1;j>=0;j--)
    {
        System.out.print(bin[j]);

    }








}




}