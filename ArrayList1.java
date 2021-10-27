import java.util.*;

public class ArrayList1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
           int temp = sc.nextInt();
           if(!arr.contains(temp)){
               arr.add(temp);
           }
        }
        System.out.print(arr);
        sc.close();
    }
}
