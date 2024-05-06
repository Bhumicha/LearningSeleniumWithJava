package Arrays;

import java.util.Arrays;

public class SortingElementsInArray {
    public static void main(String[] args)
    {
        //sorting numbers
        int a[] = {200, 400, 100, 500, 300};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(a));

        //sorting strings
        String s[] = {"A", "D", "C", "B", "E"};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(s));


    }
}
