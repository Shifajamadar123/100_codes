class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> temp= new ArrayList<>();
        Arrays.sort(a);
        count(0,target,a,res,temp);

        
        return res;
    }

    public static void count(int ind,int target,int[] a,List<List<Integer>> res,List<Integer> temp)
    {
        
        if(target==0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=ind;i<a.length;i++)
        {
            if(i>ind && a[i]==a[i-1])
            {
                continue;
            }
            if(a[i]>target)
            {
                break;
            }

            temp.add(a[i]);

            count(i+1,target-a[i],a,res,temp);

            temp.remove(temp.size()-1);

        }
        
    }
}
