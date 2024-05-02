package Polymorphism;

public class MainMethod
{
    public static void main (String[] args)
    {
        Polymorphism1 obj = new Polymorphism1();
        obj.addnumbers(); //1
        obj.addnumbers(100, 200) ; //2
        obj.addnumbers(10, 20, 30); //5
    }
}
