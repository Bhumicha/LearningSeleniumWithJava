package WaysInsertDataIntoVariables;

public class WaysToStoreDataIntoVariables {
    int a;
    String b;
    char c;
    //using object reference variables
    void printData()
    {
        System.out.println(a+" "+b+" " + c);
    }


    public void printData2(int x, String y, char z)  //creating local variables
    {
        a=x;
        b=y;
        c=z;
    }
    //using constructor using class constructor

    WaysToStoreDataIntoVariables (int x, String y, char z)
    {
        a=x;
        b=y;
        c=z;
    }

}
