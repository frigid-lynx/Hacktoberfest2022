import java.util.*;
class Prod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int prod=1;
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();sum*=arr[i];}
        System.out.println("Product of "+n+" terms: "+sum);
    }
}
