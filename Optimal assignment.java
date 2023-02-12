import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [][]a = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]= scan.nextInt();
            }
        }
        int []dp = new int[(int) Math.pow(2,n)];
        for(int i=1;i<dp.length;i++)
            dp[i]= Integer.MAX_VALUE;

        int mask=0;

        for(mask=0;mask<Math.pow(2,n)-1;mask++)
        {
            int x = Integer.bitCount(mask);
            for(int j=0;j<n;j++)
            {
                if(mask!= (1<<j))
                {
                    dp[mask | 1<<j] = Math.min(dp[mask | 1<<j], dp[mask]+a[x][j]);
                }
            }
        }
        System.out.println(dp[dp.length-1]);
    }
}