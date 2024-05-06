package ExceptionHandling;
/*
Exception - is an event which cause program termination
Checked Exceptions - identified by java compiler
Examples: InterruptedException, FileNotFound, IOException
Unchecked Exceptions - not identified by java compiler
Examples: Arithmetic exception, NullPointException, ArrayOutBoundException
*/

import Abstraction.InterfaceDemo;

import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {
        System.out.println("Program is stated...");
        Scanner sc = new Scanner(System.in);
/*
        //Example 1         //Arithmetic Exception
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        try {
            System.out.println(100 / num);
        } catch (ArithmeticException e) {
            System.out.println("Invalid Data");
        }

 */
        /*

        //Example 2
        int a[] = new int[5];
        System.out.println("Enter the position(0-4):");
        int pos = sc.nextInt();
        System.out.println("Enter a value:");
        int value = sc.nextInt();
        try
        {
            a[pos] = value; //ArrayIndexBoundsException
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid");
        }
    */



        //Example 3
        String s= "Welcome"; // NumberFormatException
        try
        {
            int num =Integer.parseInt(s);
            System.out.println(num);
        }
        catch (Exception e)
        {
            System.out.println("Invalid");
            System.out.println(e.getMessage());
        }


        /*

        //Example 4
        String l="null"; //NullPointException
        System.out.println(s.length());
         */


        System.out.println("Program is Completed...");

        System.out.println("Program is exited...");

    }
}
