class Bike
{
public void model_name()
{
   System.out.println("FZ V3");
}
public boolean fuel_type()
{
   System.out.println("Petrol");
   boolean ispetrol=true;
   return ispetrol;
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
public void Engine_type()
{
   System.out.println("BS6");
}
public void mileage()
{
   System.out.println("40 Mileage");
}
public void gear()
{
   System.out.println("5_gear");
}
public void No_of_wheel()
{
   System.out.println("2 wheel");
}
public void NO_of_indicator()
{
   System.out.println("4 indicator");
}
public void colour()
{
   System.out.println("Black");
}
public static void main(String[] arg)
{
    Bike obj=new Bike();
    obj.model_name();
    boolean a=obj.fuel_type();
    boolean b=obj.start(a);
    if(a==true && b==true)
    {
    System.out.println("bike is working");
    }
    else
    {
      System.out.println(" bike is not working");
    }
    obj.Engine_type();
    obj.mileage();
    obj.gear();
    obj.No_of_wheel();
    obj.NO_of_indicator();
    obj.colour();
}
}

