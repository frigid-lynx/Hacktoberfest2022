import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 6, 7, 4 };
        sort s = new sort(arr);
        s.bucketSort();
    }
}

class sort {
    int[] arr;

    public sort(int[] arr) {
        this.arr = arr;
    }

    public void bucketSort() {
        System.out.println(Arrays.toString(arr));
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        ArrayList<Integer> buckets[] = new ArrayList[numberOfBuckets];

        // Initialize the buckets array
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        // Add values into buckets
        for (int element : arr) {
            int bucketVal = (int) Math.ceil((float) element * numberOfBuckets / max);
            buckets[bucketVal - 1].add(element);
        }

        // print Buckets
        for (int i = 0; i < numberOfBuckets; i++) {
            Collections.sort(buckets[i]);
            System.out.println("Bucket " + (i + 1) + "# :");
            System.out.println(buckets[i]);
        }

        // Merge Buckets
        int count = 0;
        for (int i = 0; i < numberOfBuckets; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[count] = buckets[i].get(j);
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}

