package Abstraction;
//hiding the implementation details and showing only functionality to the users.
// data can only be accessed indirectly not directly

interface shape
{
    int length = 10;
    int width = 20;

    void circle(); //abstract method

    default void square() // default methods
    {
        System.out.println("This is square");
    }
    static void rectangle() //static methods can directly access from interface
    {
        System.out.println("This is rectangle");
    }
}
public class InterfaceDemo implements shape {
    public void circle()
    {
        System.out.println("This is circle");
    }

    public static void main (String[] args)
    {
        /*
        //Scenario 1
        InterfaceDemo obj = new InterfaceDemo();
        obj.circle();
        obj.square();
        shape.rectangle(); // static method
         */

        //Scenario 2
        shape obj1= new InterfaceDemo();
        obj1.circle();
        obj1.square();
        shape.rectangle();

    }

}
