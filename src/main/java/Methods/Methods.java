package Methods;

public class Methods {
    //no params and no return value
    void m1()
    {
        System.out.println("Hello");
    }

    // no prams  and return value
    String m2()
    {
        return ("Hello how are you");
    }

    // takes params and no return type
    void m3(String name)
    {
        System.out.println("Hello" +" "+name);
    }

    // takes params and returns value
    String m4(String name)
    {
        return ("Hello "+ name);
    }
}
