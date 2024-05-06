package ExceptionHandling;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class HandleExceptions {
    public static void main(String[] args) {
        System.out.println("Program is stated...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        try {
            System.out.println(100 / num);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Invalid Data...");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Data...");
        }
        catch(NullPointerException e)
        {
            System.out.println("Invalid Data...");
        }

        System.out.println("Program is Completed...");
        System.out.println("Program is exited...");

    }
}
