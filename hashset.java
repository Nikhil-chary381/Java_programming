import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        
HashSet<String> s=new HashSet<String>();
s.add("hello");
s.add("rrr");
s.add("rajamouli");
s.add("ram");
s.add("keeravani");
s.add("hello");
s.add("ram");
System.out.println(s);
System.out.println(s.size());
s.remove("hello");
System.out.println(s);
for(String i:s)
{System.out.println(i);}
System.out.println(s.contains("ram"));
System.out.println(s.contains("allu"));










    }
}
