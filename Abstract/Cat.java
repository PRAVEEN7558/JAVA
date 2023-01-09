class Cat extends Animal
{
public void sound()
    {
    System.out.println("Meow");
    }
public void Eat()
    {
    System.out.println("Cat eats a fish");
    }
public void Run()
    {
    System.out.println("Runing");
    }
public static void main(String args[])
    {
    Animal obj = new Cat();
    obj.sound();
    obj.Run();
    obj.Eat();
    }

}
