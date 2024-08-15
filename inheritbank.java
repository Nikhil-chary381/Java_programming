class bankaccount{
    public double bal=0;
    public void deposit(int amt){
    bal+=amt;
    System.out.println("deposited successfully");
    System.out.println("current account balance:"+bal);
    }
    public void withdraw(int amt){
        if(bal>=amt)
        {bal-=amt;
        System.out.println("withdraw completed");
        System.out.println("current account balance:"+bal);
        }
        else
        System.out.println("insufficient balance");
    }

}
class savingsaccount extends bankaccount{
    
    public void withdraw(int amt)
    {
        if(amt>100)
        super.withdraw(amt);
        else
        System.out.println("withdraw method in subclass");
    
    }
}

public class inheritbank {
    public static void main(String[] args) {
        savingsaccount s=new savingsaccount();
        s.deposit(20000);
        s.withdraw(15000);
        s.withdraw(4901);
        s.withdraw(80);

    }
    
}
