
import java.io.File;
public class create_file
{public static void main(String[]args){
 try
 {File file=new File("files.txt");
  if(file.createNewFile())
  {System.out.println("file created:"+file.getName());}
  else
  {System.out.println("file already exists");}
 }
 catch(Exception e)
 {System.out.println("something went wrong");}
}
}
 
  
  