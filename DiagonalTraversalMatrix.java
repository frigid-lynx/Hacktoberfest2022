import java.util.*;

public class DiagonalTraversalMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int sum = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int l=0;l<=n-1;l++){
                int i=0,j=n-1-l;
                sum=0;
                while(i<n && j<n){
                    sum += arr[i][j];
                    i+=1;
                    j+=1;
                }
                System.out.print(sum+" ");
            }
            for(int l=0;l<n-1;l++){
                int i=l+1,j=0;
                sum=0;
                while(i<n && j<n){
                    sum += arr[i][j];
                    i+=1;
                    j+=1;
                }
                System.out.print(sum+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}