//program for insertion sort in java
import java.util.*;
public class InsertionSort {
    public static void insertionSort(int arr[]) {
       for(int i=1; i<arr.length; i++) {
           int curr = arr[i];
           int prev = i-1;
           while(prev >= 0 && arr[prev] > curr) {
               arr[prev+1] = arr[prev];
               prev--;
           }
           arr[prev+1] = curr;
       }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        printArr(arr);

      
    }
}
