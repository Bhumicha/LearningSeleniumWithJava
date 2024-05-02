package Inheritance;
class Parent
{
    void display(int a)
    {
        System.out.println(a);
    }
}
class Child1 extends Parent
{
    void show(int b)
    {
        System.out.println(b);
    }
}
class Child2 extends Parent
{
    void show(int c)
    {
        System.out.println(c);
    }
}

public class HierrarchyInheritance
{
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.display(100);
        c1.show(300);

        Child1 c2 = new Child1();
        c2.display(500);
        c2.show(600);
    }
}
