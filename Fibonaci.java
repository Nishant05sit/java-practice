import java.util.Scanner;

public class Fibonaci {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      int a = 0, b = 1, sum = 0;
      for (int i = 2; i < n; i++) {
         sum = a + b;
         a = b;
         b = sum;
      }
      System.out.print(sum);
   }
}
