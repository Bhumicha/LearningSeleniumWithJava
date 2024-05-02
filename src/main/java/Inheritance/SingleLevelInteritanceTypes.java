package Inheritance;
class A //parent class
{
    int a=100;
    void display()
    {
        System.out.println(a);
    }
}
class B extends A //child class extending to A
{
    int b=200;
    void show()
    {
        System.out.println(a+b);
    }
}

public class SingleLevelInteritanceTypes {
    public static void main (String[] args)
    {
        B obj1= new B();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        obj1.display();
        obj1.show();


    }
}
