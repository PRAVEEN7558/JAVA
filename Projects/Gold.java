class Gold

{
//int a,b;
Gold()
{
System.out.println("Welcome");
}
Gold(int amount)
{
this();
System.out.println("1 Gold coin");
}
Gold(int a,int b)
{
this();
System.out.println("50% Discount");
//this.a=a;
//this.b=b;
}

public static void main(String arg[])
{
Gold obj=new Gold(1,2);
//obj.Gold(10,20);
}}
