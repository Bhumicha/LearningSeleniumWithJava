package Polymorphism;

public class Polymorphism1 {
    int a=10, b=20 , c=30;
    void addnumbers() //1
    {
        System.out.println(a+b);
    }
    void addnumbers(int x, int y) //2
    {
        System.out.println(x+y);
    }
    void addnumbers(int x, double y) //3
    {
        System.out.println(x+y);
    }
    void addnumbers(double x, int y) //4
    {
        System.out.println(x+y);
    }
    void addnumbers (int a, int b, int c) //5
    {
        System.out.println(a+b+c);
    }
}
