class Solution {
    
    public List<List<Integer>> combinationSum(int[] a, int target) {
        
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        count(0,a,target,res,temp);


        return res;
    }

    public static void count(int i,int []a,int target,List<List<Integer>> res,List<Integer> temp)
    {
        if(i==a.length)
        {
            if(target==0)
            {
                res.add(new ArrayList<>(temp));
                
            }
            return;
        }

        if(a[i]<=target)
        {
            temp.add(a[i]);
            count(i,a,target-a[i],res,temp);
            temp.remove(temp.size()-1);
        }
        
        count(i+1,a,target,res,temp);
        return;
    }
}
