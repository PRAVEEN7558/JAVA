package Admin;
import Admin.Honda_Car;
public class Model 
    {
    public static void main(String[] args) 
    {
        Honda_Car ca1 = new Honda_Car();
        ca1.setName("Porsche Cayenne 4.8-litre V8 ");
        ca1.setTopSpeed(173.0d);
        System.out.println(ca1.getName()+""+ca1.getTopSpeedMPH());
    }
}
