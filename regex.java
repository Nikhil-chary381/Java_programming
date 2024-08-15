import java.util.regex.Pattern;
import java.util.regex.Matcher;

class regex
{public static void main(String[]args)
 {Pattern p=Pattern.compile(".java....programs");
   Matcher m=p.matcher("hjava programs");
   System.out.println(m.find());
  }
}