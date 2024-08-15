//import java.util.*;
import java.io.FileWriter;
public class append_file{
public static void main(String[] args) {
 try{
    FileWriter file=new FileWriter("C:\\java programs\\text1.txt",true);
    file.write("appending statement into a file rrr");
    file.close();
    System.out.println("successfully written into file");
 }
 catch(Exception e){
    System.out.println(e);
 }
}


}