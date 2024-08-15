public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("hello");
        s.append("world");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.indexOf("world"));
        
        System.out.println(s.reverse());
        s.reverse();
        s.replace(0,5,"book");
        System.out.println(s);
        StringBuilder str=new StringBuilder("nikhil chary and vinay chary");
        str.insert(0,"hello,");
        System.out.println(str);
        str.delete(12,15);
        System.out.println(str);
    }
    
}
