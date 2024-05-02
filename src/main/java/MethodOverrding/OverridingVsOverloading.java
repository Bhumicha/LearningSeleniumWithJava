package MethodOverrding;

import org.openqa.selenium.json.JsonOutput;

class ABC
{
    void m1(int a)
    {
        System.out.println(a);
    }
    void m2(int b)
    {
        System.out.println(b);
    }
}
class XYZ extends ABC
{
    void m1(int a) //overriding
    {
        System.out.println(a*a);
    }
    void m2(int  a, int b) //overloading
    {
        System.out.println(a+b);
    }
}

public class OverridingVsOverloading {
    public static void main (String[] args) {
        XYZ ob1 = new XYZ();
        ob1.m1(10);
        ob1.m2(20);
        ob1.m2(10,20);
    }

}

