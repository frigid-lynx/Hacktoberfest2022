import java.util.Arrays;
import java.util.Scanner;

class CountingSort{

    public static void main(String[] args) {
  
      System.out.println("Counting sort in Java");
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number of elements");
      int n = s.nextInt();
      int[] input = new int[n];
      System.out.println("Enter the elements");
      for (int i = 0; i < n; i++) {
        input[i] = s.nextInt();
      }
  
      System.out.println("integer array before sorting");
      System.out.println(Arrays.toString(input));
  
      // sorting array using Counting Sort Algorithm
      int max = getMax(input);
      countingSort(input,max);
  
      System.out.println("integer array after sorting using counting sort algorithm");
      System.out.println(Arrays.toString(input));
  
    }

    public static int getMax(int[] input) {
      int max = input[0];
      for (int i = 1; i < input.length; i++) {
        if (input[i] > max) {
          max = input[i];
        }
      }
      return max;
    }
  
    public static void countingSort(int[] input, int k) {
      // create buckets
      int counter[] = new int[k + 1];
      
      // fill buckets
      for (int i : input) {
        counter[i]++;
      }
      
      // sort array
      int ndx = 0;
      for (int i = 0; i < counter.length; i++) {
        while (0 < counter[i]) {
          input[ndx++] = i;
          counter[i]--;
        }
      }
    }
  
  }