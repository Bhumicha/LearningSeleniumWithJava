package Examples;

public class FibonacciSeries {
    public static void main(String[] args) {
        int N = 10;
        Fibonacci(N);
    }
    static void Fibonacci(int N)
    {
        int n1 = 0,
        n2 = 1;
        for (int i = 0; i<=N; i++)
        {
            System.out.println(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}

