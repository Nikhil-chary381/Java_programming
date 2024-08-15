import java.io.File;
import java.io.IOException;
public class filelist_directory
{public static void main(String[]args)
 {String path="C:\\java programs";
  filelist_directory n=new filelist_directory();
  n.function(path);
 }
  public void function(String path)
 {filelist_directory n=new filelist_directory();
  File f=new File(path);
  File[] file=f.listFiles();
  for(File files:file)
  {if(files.isFile())
   {System.out.println(files.getName());}
   else if(files.isDirectory())
   {n.function(files.getAbsolutePath());}
  }
 }
}

  