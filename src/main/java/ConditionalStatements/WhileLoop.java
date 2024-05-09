package ConditionalStatements;

public class WhileLoop {
    public static void main(String[] args) {

        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            if (!(a < 10)) {
                break;
            }
            a = a + 1;
        }
    }
}

