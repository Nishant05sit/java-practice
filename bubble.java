

public class bubble{
    public static void main(String[] args) {
        int arr[] ={5,2,9,4,8,0,1};
        int temp = 0;
        System.out.println(arr.length);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
        for(int i=0;i<arr.length; i++){
         System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}