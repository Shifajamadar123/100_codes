class Solution {
    int getPairsCount(int[] a, int n, int k) {
        // code here
        int c=0;
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            int val =k-a[i];
            if(h.containsKey(val))
            {
                c =c+ h.get(val);
            }
            if(h.get(a[i])!=null){
            h.put(a[i],h.get(a[i])+1);}
            else
            {
                h.put(a[i],1);
            }
            
        }
        return c;
    }
    
}
