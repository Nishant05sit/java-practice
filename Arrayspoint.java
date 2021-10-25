import java.util.*;

public class Arrayspoint {

    public static class Point {
        int x, y;
        public Point(int a, int b) {
            this.x = a;
            this.y = b;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of pair");
        int n = sc.nextInt();
        int a,b;
        Point arr[] = new Point[n];
        for (int i = 0; i < arr.length; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            arr[i] = new Point(a,b);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("(" + arr[i].x+" " + arr[i].y+" " + ")");
        }
        sc.close();
    }

}
