//import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
public class count_charfile
{public static void main(String[] args) {
    char[] s=new char[100];String str="";
 try{  
FileReader f=new FileReader("text1.txt");
BufferedReader b=new BufferedReader(f);
while(b.readLine()!=null)
{str=b.read(s);}

System.out.println();







}
catch(Exception e)
{System.out.println(e);}


}
}