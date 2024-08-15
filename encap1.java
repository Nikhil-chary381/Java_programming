public class encap1 {
    
    private String name;
    private String country;
    private double salary;
    
    public void setName(String name)
    {this.name=name;}
    public String getName()
    {return name;}
    public void setCountry(String country)
    {this.country=country;}
    public String getCountry()
    {return country;}
    public void setSalary(double salary)
    {this.salary=salary;}
    public double getSalary()
    {return salary;}
public static void main(String[] args) {
    encap1 e=new encap1();
    e.setName("nikhil");
    e.setCountry("India");
    e.setSalary(200000);
    System.out.println("name:"+e.getName());
    System.out.println("country:"+e.getCountry());
    System.out.println("salary:"+e.getSalary());
    e.setName("vinay");
    e.setSalary(30000);
    System.out.println("name:"+e.getName());
    System.out.println("country:"+e.getCountry());
    System.out.println("salary:"+e.getSalary());

}
    
}

