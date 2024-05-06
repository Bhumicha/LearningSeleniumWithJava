package Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        //Declaring Array
        //Approach 1
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        //Approach 2
        int b[] = {100, 200, 3000, 400, 50};

        //finding out length of array
        System.out.println("Length: " + a.length);

        //reading single value from array
        System.out.println("Single value: " + a[1]);

        //finding all the values from the array
        // using normal for loop
        for (int i = 0; i<a.length; i++)
        {
            System.out.println("Normal loop array values: " + a[i]);
        }
        //enhanced for loop
        for (int x:a)
        {
            System.out.println("The values are: " +x);
        }
    }
}