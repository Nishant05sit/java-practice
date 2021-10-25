import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum <= 100) {
            sum = sum + sc.nextInt();
        }
        System.out.print("Done:" + " " + sum);
        sc.close();
    }
}
