class Solution {
    public List<List<Integer>> subsetsWithDup(int[] a) {
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> temp=new ArrayList<>();
        fun(0,a,res,temp);
        return res;
    }

    public static void fun(int ind,int []a,List<List<Integer>> res,List<Integer> temp)
    {
        res.add(new ArrayList<>(temp));

        for(int i=ind;i<a.length;i++)
        {
            if(i!=ind && a[i]==a[i-1])
            {
                continue;
            }
            temp.add(a[i]);
            fun(i+1,a,res,temp);
            // for(List<Integer> x:res)
            // {
            //     for(int t:x)
            //     {
            //         System.out.print(t+" ");
            //     }
            //     System.out.println("");
            // }
            temp.remove(temp.size()-1);
            
        }
    }
}
