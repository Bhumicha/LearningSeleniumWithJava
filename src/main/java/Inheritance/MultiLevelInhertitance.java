package Inheritance;

    class X //parent class
    {
        int a=100;
        void display()
        {
            System.out.println(a);
        }
    }
    class Y extends Inheritance.X //child class extending to A
    {
        int b=200;
        void show()
        {
            System.out.println(b);
        }
    }
    class Z extends Inheritance.Y //child class extending to A
    {
     int c=300;
        void print()
        {
            System.out.println(c);
        }
    }

    public class MultiLevelInhertitance {
        public static void main (String[] args)
        {
            Inheritance.Z obj2= new Inheritance.Z();
//            System.out.println(obj2.a);
//            System.out.println(obj2.b);
//            System.out.println(obj2.c);

            obj2.display();
            obj2.show();
            obj2.print();


        }
    }


