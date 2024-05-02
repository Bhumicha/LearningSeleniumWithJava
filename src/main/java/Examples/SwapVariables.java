package Examples;

public class SwapVariables {

    public static void main(String[] args) {
//swap values with third varible
        int x=10;
        int y=20;
        int i=20;
        int j=30;
        SwapValues(x,y);
        SwapValues2(i, j);
    }
    public static void SwapValues(int a, int b)
    {
        System.out.println("Original Value- a:"+a + "b:" +b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Swapped values- a:" +a +"b:" +b);
    }

//         swap without using third varible
    public static void SwapValues2(int m, int n) {
        System.out.println("Original Values- m:" + m + "n:" + n);
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("Original Values- m:" + m + "n:" + n);
    }
    }



