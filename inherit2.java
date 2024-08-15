class employee{
    private int salary;
    public employee(int salary)
    {
        this.salary=salary;
    }
    public void work()
    {System.out.println("employee work method");}
    public int getSalary()
    {return salary;}
}
class hr extends employee{
    public hr(int salary){
        super(salary);
    }
    public void work()
    {System.out.println("work method in hr class");}
    public void addEmployee()
    {System.out.println("adding employee");}
}

public class inherit2 {
    public static void main(String[] args) {
    employee e=new employee(25000);
    hr h=new hr(50000);
    e.work();
    h.work();
    h.addEmployee();
    System.out.println("salary through employee class"+e.getSalary());
   System.out.println("salary through hr class"+h.getSalary());

    
}
}
