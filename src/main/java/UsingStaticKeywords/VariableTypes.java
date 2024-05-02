package UsingStaticKeywords;

public class VariableTypes {
    /*
    class variable/instance variable
    local variable
     */

    int x, y; // class variables which can be accessed throughout the class
    VariableTypes(int a, int b) // local variable which can be accessed through their own method
    {
        x=a;
        y=b;
    }
    /*
    // to use the same variable as of class use this.
    UsingStaticKeywords(int x, int y) // local variable which can be accessed through their own method
    {
        this.x=x;
        this.y=y;
    }
     */
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main (String[]args)
    {
        VariableTypes th = new VariableTypes(10, 200);
        th.display();
    }
}
