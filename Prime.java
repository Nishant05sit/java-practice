import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // we take to read the input from user.
        int n = sc.nextInt(); // here we take variable n as input from user which is integer type.
        sc.close();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // here we check the condition that number is prime or not.
                count++;
            }
        }
        if (count == 2) {
            System.out.print("Prime" + " " + n);
        } else {
            System.out.print("Composite Number");
        }
    }
}
