
//import java.io.*;
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int max = n, min = n;
        if (n >= 0) {
            while (true) {
                n = sc.nextInt();
                if (n < 0) {
                    break;
                }
                if (n > max) { // max = n>max ? n:max;
                    max = n;
                }
                if (n < min) { // min = n<min ? n:min;
                    min = n;
                }
            }
        }
        System.out.print("Max =" + max + " " + "Min =" + " " + min);
    }
}
