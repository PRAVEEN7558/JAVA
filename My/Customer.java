package My;
//import My.Customer;
public class Customer
{
    public String name;
    protected int Number;
    public int acc_Num;
    public double balance;
    public static String Bank_name; 
    public final static int ifscCode=1234;
protected Customer(String name,int Number,int acc_Num,double balance)
{
    this.name=name;
    this.Number=Number;
    this.acc_Num=acc_Num;
    this.balance=balance;
    System.out.println("Customer Id");
}
public Customer(String name,int Number,int acc_Num)
{
    this.name=name;
    this.Number=Number;
    this.acc_Num=acc_Num;
}

}

