package MethodOverrding;
class Bank
{
    double roi()
    {
        return 0;
    }
}
class ICIC extends Bank
{
    double roi()
    {
        return 10.5;
    }
}

class SBI
{
    double roi()
    {
        return 11;
    }
}

public class MainOverriding {
    public static void main (String[]args)
    {
        SBI m1= new SBI();
        System.out.println(m1.roi());
    }
}
