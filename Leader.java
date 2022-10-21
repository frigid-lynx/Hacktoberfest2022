// find leaders in an array

public class Leader{
     public static void main(String[] args) {
       
        int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
        int length = arr.length;
        leaders(arr, length);
    }
    static void leaders(int arr[], int size){
        int max_from_right =  arr[size-1];
        System.out.print("Leaders in the array: ");
        System.out.print(max_from_right + " ");
       
        for (int i = size-2; i >= 0; i--){
            if (max_from_right < arr[i]){           
            max_from_right = arr[i];
            System.out.print(max_from_right + " ");
            }
        }    
  }
  
    
