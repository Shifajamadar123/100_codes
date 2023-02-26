import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();

		for(int i=0;i<(int)Math.pow(2,arr.size());i++)
		{
			List<Integer> l=new ArrayList<>();
			for(int j=0;j<arr.size();j++)
			{
				if((i & 1<<j) !=0)
				{
					l.add(arr.get(j));
				}
			}
			res.add(new ArrayList<>(l));
		}

		return res;
	}
}
