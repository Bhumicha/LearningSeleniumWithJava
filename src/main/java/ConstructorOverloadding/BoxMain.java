package ConstructorOverloadding;

public class BoxMain {
    public static void main(String[]args) {
    /*
            //1
    {
        Box object= new Box();
        System.out.println(object.volume());
    }
    */
    /*
            //4
    {
        Box object = new Box(1, 2, 3);
        System.out.println(object.volume());
    }
    */
        //3
        Box object= new Box(1);
        System.out.println(object.volume());
    }
}
