/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray a)
    {
        int ans=peakIndexInMountainArray(a);
        int res=-1;
        int start=0;
        int end=ans;
        while(start<=end)
        {
            int mid=start +(end-start)/2;
            if(target>a.get(mid))
            {
                start=mid+1;
            }
            else if(a.get(mid)>target)
            {
                end=mid-1;
            }
            else
            {
                return(mid);
            }
        }
            start=ans;
            end=a.length()-1;
            while(start<=end)
            {
                int mid=start +(end-start)/2;
                if(a.get(mid)<target)
                {
                    end=mid-1;
                }
                else if(a.get(mid)>target)
                {
                    start=mid+1;
                }
                else
                {
                    return(mid);
                }
            }
        return(res);
        
    }
    public int peakIndexInMountainArray(MountainArray a) {
        int start=0;
        
        int end=a.length()-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(a.get(mid)>a.get(mid+1))
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return(start);
    }
}
