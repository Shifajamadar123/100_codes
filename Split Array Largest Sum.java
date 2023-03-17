import java.lang.*;
class Solution {
    public int splitArray(int[] a, int m) {
        int start=0;
        int end=0;
        for(int i=0;i<a.length;i++)
        {
            start=Math.max(start,a[i]);//this will contain max element
            end=end+a[i];
        }
        
        while(start<end)
        {
            int mid=start+(end-start)/2;
            int pieces=1;
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                sum+=a[i];
                if(sum>mid)
                {
                    pieces++;
                    sum=0;
                    i--;
                }
            }
            if(pieces<=m)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return(start);//here start==end
    }
}
