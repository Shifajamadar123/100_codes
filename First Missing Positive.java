class Solution {
    public int firstMissingPositive(int[] a) {
        int i=0;
        while(i<a.length)
        {
            int crt=a[i]-1;
            if(a[i]>0 && a[i]<=a.length && a[crt]!=a[i])
            {
                swap(a,i,crt);
            }
            else
                i++;
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]!=i+1)
                return(i+1);
        }
        return(a.length+1);
        
    }
    
    static void swap(int []a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
