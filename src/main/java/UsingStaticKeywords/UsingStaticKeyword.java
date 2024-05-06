package UsingStaticKeywords;

public class UsingStaticKeyword {
    /*
     */
    static int a=10; //static variable
    int b=20; //non static variable

    static void m1()
    {
        System.out.println("This is static method...");
    }
    void m2()
    {
        System.out.println("This is m2 non static method...");
    }
    public static void main(String[] args)
    {
        // accessing static variable directly from the method
        System.out.println(a);
        m1();

        // accessing non static variable needs an object
        UsingStaticKeyword obj = new UsingStaticKeyword();
        System.out.println(obj.b);
        obj.m2();
    }
}
