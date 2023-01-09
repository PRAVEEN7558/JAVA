public class Mobileshop
{
int disc;
public Mobileshop(int price,int disc)
{
//this();
System.out.println(price-disc);
}
public Mobileshop()
{
 this(10000,500);
System.out.println("welcome");
}
public static void main(String asrg[])
{
Mobileshop Mobile1=new Mobileshop();
Mobileshop Mobile2=new Mobileshop(8000,400);
}
}

