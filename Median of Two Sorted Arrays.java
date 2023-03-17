class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp;
        int []nums3;
        nums3=new int[nums1.length+nums2.length];
        double res;
        for(int i=0;i<nums3.length;i++)
        {
            if(i<nums1.length)
            {
                nums3[i]=nums1[i];
            }
            else
            {
                nums3[i]=nums2[i-nums1.length];
            }
        }
        for(int i=0;i<nums3.length;i++)
        {
            for(int j=0;j<nums3.length-1-i;j++)
            {
                if(nums3[j]>nums3[j+1])
                {
                    temp=nums3[j];
                    nums3[j]=nums3[j+1];
                    nums3[j+1]=temp;
                }
            }
        }
        
        
        if(nums3.length%2==0)
        {
            res=(nums3[nums3.length/2-1]+nums3[nums3.length/2])/2.0;
        }
        else
            res=nums3[nums3.length/2];
        return res;
    }
}
