class shape
{ public void getArea(double l,double b)
    {System.out.println("area");}

}
class rect extends shape
{
public void getArea(double l,double b)
{
System.out.println("area:"+l*b);
}

}
public class inherit1 {

    public static void main(String[] args) {
        rect r=new rect();
        r.getArea(20.1,2);
    }
}