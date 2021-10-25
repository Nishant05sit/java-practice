import java.util.*;

public class ArraysOdd {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int j=0,k=n-1;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
              temp[j] = arr[i];
              j++;
            }
            else{
                temp[k] = arr[i];
                k--;
            }
        }
        copyArray(temp, arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }    
    public static void copyArray(int temp[], int arr[]){
    for(int i=0; i<arr.length; i++){
        arr[i] = temp[i];
    }
    }
}
