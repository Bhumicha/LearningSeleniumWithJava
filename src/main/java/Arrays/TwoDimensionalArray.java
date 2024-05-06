package Arrays;
//Also known as multidimensional array

public class TwoDimensionalArray {
    public static void main (String[] args)
    {
        //declaring array
        //Approach 1
        int a[] [] = new int [3] [2]; //3 is rows and 2 is for columns
        a [0] [0] = 100;
        a [0] [1] = 200;

        a [1] [0] = 300;
        a [1] [1] = 400;

        a [2] [0] = 500;
        a [2] [1] = 600;

        //Approach 2
        int b[] [] = {{100, 200}, {300, 400}, {500, 600}};

        //size of an array
        System.out.println("Length of rows: " + a.length);
        System.out.println("Length of columns: " + a[0].length);
        System.out.println(a[0][1]);

        //read single value from a multidimensional array
        System.out.println(a[0][1]);

        //read all rows and columns from a multidimensional array
        for (int r=0; r<=2; r++) //0 1 2 3
            //for (int r=0; r<=a.length-1; r++) //0 1 2 3

            {
            for (int c=0; c<=1; c++) //0 1 2
            {
                System.out.println(a[r][c]+"");
            }
            System.out.println();
        }

    }
}
