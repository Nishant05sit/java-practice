import java.util.Scanner;

public class SumofDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        System.out.print(sum);
    }
}
