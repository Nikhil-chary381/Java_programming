import java.util.*;
class person 
{private String name;
 private int age;
 public void set_name(String name)
 {this.name=name;}
 public String get_name()
 {return name;}
 public void set_age(int age)
 {this.age=age;}
 public int get_age()
 {return age;}
}
class encapsulation
{public static void main(String []args)
{try (Scanner sc = new Scanner(System.in)) {
    person p=new person();
     System.out.print("enter name and age of a person:");
     String s=sc.nextLine();
     int age=sc.nextInt();
     p.set_name(s);
     p.set_age(age);
     System.out.println("name :"+p.get_name());
     System.out.println("age :"+p.get_age());
}
}
}

 