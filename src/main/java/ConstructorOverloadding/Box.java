package ConstructorOverloadding;

public class Box {
    int a,b,c;
    Box() //1
    {
        a=0;
        b=0;
        c=0;
        //a=b=c=0 only if the values are same
    }
    Box(int x, int y, int z) //2
    {
        a=x;
        b=y;
        c=z;
    }
    Box(int len) //3
    {
        a=b=c=len;
    }
    int volume() //4
    {
        return (a*b*c);
    }

}
