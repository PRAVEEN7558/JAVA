public class BankAccount{

	int accountNumber;
	double balance;
	boolean is_savings;
   final static int ifscCode=1234;//static variable 
   final static double interestRate= 7.5;
	
	double deposit(int number, double amt)
	{
	double tBal=amt+balance;// tbal=1000+2000;
	balance = tBal;
	return tBal;
	}
	
	double withdraw(int number, double amt)
	{
   		if(balance>amt) //3000>1500
			{
			double tBalance=balance-amt;
			balance = tBalance;
			return tBalance;
			}
			else{
		   System.out.println("Insufficient balance");
		   return balance;
			}
	}		

    void display()
        {
         System.out.println("Your account number : "+accountNumber);
		 System.out.println(" current balance : "+balance);
		 System.out.println("Account is Saving Type : "+is_savings);
         System.out.println("Ifsc code is : " +ifscCode);
           System.out.println("Bank intrest rate is : "+interestRate);
        }
	
	public static void main(String arg[])
	{
        //System.out.println(ifscCode);
       // System.out.println(accountNumber);
		BankAccount cust1 = new BankAccount	();
        BankAccount cust2 = new BankAccount	();
        BankAccount cust3 = new BankAccount	();

        System.out.println(ifscCode);

           System.out.println("Before initialisation for cust1 \n");

            cust1.display();//1234
           // ifscCode=123456;
           // interestRate =8.6;
           cust1.accountNumber = 101;
           cust1.balance = 2000.0;
           cust1.is_savings= true;        
         System.out.println("After initialisation for cust1");
           cust1.display();//123456
       
       //cust1.deposit(cust1.accountNumber);
        //cust1.deposit(1200);
        cust1.withdraw(cust1.accountNumber,15000);
        System.out.println("After withdraw");
           cust1.display();
           cust2.display();
           cust3.display();
	}
		
}		

