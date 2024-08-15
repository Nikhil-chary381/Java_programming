
import java.io.FileReader;
import java.io.FileWriter;
public class copyfile{
    public static void main(String[] args) {
        try{
           FileReader fr=new FileReader("text1.txt");
           FileWriter fw=new FileWriter("text2.txt");
           int i=0;
           String s="";
           while((i=fr.read())!=-1){
           s+=(char)i;
           }

          fw.write(s);
          fr.close();
          fw.close();
          System.out.println("file is successfully copied");
        }
        catch(Exception e)
        {System.out.println(e);}

    }
}