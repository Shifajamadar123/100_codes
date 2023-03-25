class Solution {
    public int coinChange(int[] coins, int V) {
        int M=coins.length;
        if(M==1)
	    {
	        if(V%coins[0]==0)
	        {
	            return V/coins[0];
	        }
	        else
	        {
	            return -1;
	        }
	    }
	    int []dp=new int[V+1];
		Arrays.fill(dp,10003);
	    Arrays.sort(coins);
	    dp[0]=0;
	    for(int i=1;i<=V;i++)
	    {
	        for(int j=0;j<M;j++)
	        {
	            if(i-coins[j]>=0)
	            {
	                    
	              dp[i]= Math.min(dp[i],dp[i-coins[j]]+1);
	                    
	            }
	            
	        }
	       
	        
	    }
	    
	    //System.out.println(Arrays.toString(dp));
	    if(dp[V]==10003)
        {
            return -1;
        }
	    
	    return dp[V];
    }
}
