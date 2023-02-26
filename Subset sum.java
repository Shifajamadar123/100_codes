import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int a[]) {
        // Write your code here..

        ArrayList<Integer> res=new ArrayList<>();

        fun(0,a,0,res);
        Collections.sort(res);
        return res;
    }

    public static void fun(int i,int []a,int sum,ArrayList<Integer> res)
    {
        if(i>=a.length)
        {
            res.add(sum);
            return;
        }
        fun(i+1,a,sum+a[i],res);

        fun(i+1,a,sum,res);

    }

}
