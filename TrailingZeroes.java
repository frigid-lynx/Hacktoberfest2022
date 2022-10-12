import java.util.*;
import java.math.BigInteger; 

public class TrailingZeroes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        BigInteger n = sc.nextBigInteger();
        BigInteger x = BigInteger.valueOf(5);
        BigInteger count = BigInteger.valueOf(0);
         while(x.compareTo(n) <= 0){
             count = count.add(n.divide(x)); 
             x = x.multiply(BigInteger.valueOf(5));
         }
        System.out.println(count);
        }
        sc.close();
    }
}