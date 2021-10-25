import java.util.*;

public class ArraysRept {
    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (t == arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
