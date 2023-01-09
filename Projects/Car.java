class Car
{
public void model_name()
{
   System.out.println("SwiftDzire");
}
public boolean fuel_type()
{
   System.out.println("diesel");
   boolean isdiesel=true;
   return isdiesel;
}
public boolean start(boolean fuel)
{
   if(fuel==true)             
   return true;
   else
   {
   return false;
   }
}

public void mileage()
{
  System.out.println("15 Mileage");
}
public void gear()
{
   System.out.println("6_gear");
}
public void No_of_tyres()
{
  System.out.println("4 tyres");
}
public void NO_of_seats()
{
   System.out.println("4 seat");
}
public static void main(String[] arg)
{
    Car obj=new Car();
    obj.model_name();
    boolean a=obj.fuel_type();
    boolean b=obj.start(a);
    if(a==true && b==true)
    {
    System.out.println("car is working");
    }
    else
    {
      System.out.println(" car is not working");
    }
    obj.mileage();
    obj.gear();
    obj.No_of_tyres();
    obj.NO_of_seats();
}
}

