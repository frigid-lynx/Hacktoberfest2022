import java.util.*;
import java.io.*;

public class unionOfTwoSortedArrays {

    /*You have to complete union function and return an Arraylist which contains union elements of the two arrays*/
    public static ArrayList<Integer> union(int[] a,int[] b) {
        //write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                if((ans.size() == 0) || (ans.get(ans.size() - 1) != a[i]))ans.add(a[i]);
                i++;
            }
            else{
                if((ans.size() == 0) || (ans.get(ans.size() - 1) != b[j]))ans.add(b[j]);
                j++;
            }
        }
        while(i < a.length){
            if((ans.size() == 0) || (ans.get(ans.size() - 1) != a[i]))ans.add(a[i]);
                i++;
        }
        while(j < b.length){
            if((ans.size() == 0) || (ans.get(ans.size() - 1) != b[j]))ans.add(b[j]);
                j++;
        }
        return ans;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]a = new int[n];
        for(int i=0; i < n;i++) {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[]b = new int[m];
        for(int i=0;i < m;i++) {
            b[i] = scn.nextInt();
        }

        ArrayList<Integer>ans = union(a,b);

        //print answer list
        for(int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
        scn.close();
    }
}