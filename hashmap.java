import java.util.HashMap;

public class hashmap {
    public static void main(String[]args){

HashMap<String,Integer> h=new HashMap<String,Integer>();

h.put("ntr", 40);
h.put("charan",34);
h.put("hari",44);
h.put("kiran",32);
h.put("ram",21);
System.out.println(h);
for(String i:h.keySet())
{System.out.println(i);}
for(Integer s:h.values())
{System.out.println(s);}
System.out.println(h.size());
h.remove("hari");
System.out.println(h);
System.out.println(h.size());



    }
}
