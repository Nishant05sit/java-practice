import java.util.*;

public class FibonaciRec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonaci(n));
        sc.close();
    }

    public static int fibonaci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
}
