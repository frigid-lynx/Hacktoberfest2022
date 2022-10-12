import java.util.*;

public class MatrixRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        t = STDIN_SCANNER.nextInt();
        for(int l = 1; l <= t; l++) {
            System.out.println("Test Case #" + l + ":");
            int n;
            n = STDIN_SCANNER.nextInt();
            int[][] arr2 = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    arr2[j][n - i - 1] = STDIN_SCANNER.nextInt();
                    // printf(" %d",x);
                }
                // printf(" ");
            }
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}