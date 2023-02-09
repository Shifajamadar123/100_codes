import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a,b;

        System.out.println("Enter two strings:");
        a=scan.next();
        b=scan.next();

        System.out.println("Longest common subsequence: "+getLCS(a,b));

    }


    public static int getLCS(String a,String b)
    {
        int [][]lcs= new int[a.length()+1][b.length()+1];
        for(int i=1;i<=a.length();i++)
        {
            for(int j=1;j<=b.length();j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    lcs[i][j]= lcs[i-1][j-1]+1;
                }
                else
                {
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        return(lcs[a.length()][b.length()]);
    }
}