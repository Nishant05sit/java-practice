import java.util.*;

public class MultiArray {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int arr[][] = new int[n][m];
       for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
               arr[i][j] = sc.nextInt();
            }
        }
        int sum =0;
        for(int i=0; i<n; i++){
            sum = 0;
            int max = arr[i][0];
            for(int j=0; j<m; j++){
                sum += arr[i][j];
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("Row :-"+" "+sum);
            System.out.println("Max is row"+(i+1)+":-"+" "+max);
        }
        sc.close();
        for(int i=0; i<m; i++){
            sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[j][i];
            }
            System.out.println("Col :-"+" "+sum);
        }
    }    
}
