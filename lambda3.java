

@FunctionalInterface
interface A 
{
void touppercase(String s);

}
@FunctionalInterface
interface B
{
    void tolowercase(String str);
}

public class lambda3 {
    public static void main(String[] args) {
            A a=(String s) -> System.out.println(s.toUpperCase());
            B b=(String str) -> System.out.println(str.toLowerCase());
            a.touppercase("Hello world");
            b.tolowercase("BAHUBALI Rrr");

    }
    
}
