
//import java.util.Scanner;
import java.util.*;

public class Arraysum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0, product = 1, avg = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            product *= arr[i];
            avg = sum / n;
        }
        System.out.println(sum + " " + product + " " + avg);
    }
}
