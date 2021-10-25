import java.util.*;

public class Even1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
