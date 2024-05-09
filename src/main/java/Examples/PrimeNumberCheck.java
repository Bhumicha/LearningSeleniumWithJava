package Examples;

import java.util.Scanner;


public class PrimeNumberCheck {
    // check if the number is prime number
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (CheckPrime(n))
        {
            System.out.println(n + "is prime number");
        } else {
            System.out.println(n + "is not prime number");
        }
    }

    static boolean CheckPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2; i <= n/2; i++)
        {
            if ((n%i)==0)
                return false;
        }
        return true;
    }
}

//    public static void main(String[] args) {
//        // display prime numbers
//        int i, n, count;
//        System.out.println("Prime numbers from 1 50 are: ");
//        for (n = 1; n <= 100; n++) {
//            count = 0;
//            for (i = 2; i <= n / 2; i++) {
//                if (n % i == 0)
//                {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0 && n != 1)
//            {
//                System.out.println(n + "");
//            }
//        }
//    }
//}
