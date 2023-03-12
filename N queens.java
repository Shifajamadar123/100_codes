class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char [][]a = new char[n][n];
        for(char []x:a)
        {
            Arrays.fill(x,'.');
        }
        List<List<String>> res = new ArrayList<>();
        fun(n,a,0,res);

        return res;
    }

    public static void fun(int n,char [][]a,int col,List<List<String>> res)
    {
        if(col==n)
        {
            List<String> list = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(new String(a[i]));
            }
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int j=0;j<n;j++)
        {
            if(isSafe(col,j,a,n))
            {
                a[j][col]='Q';
                fun(n,a,col+1,res);
                a[j][col]='.';
            }
        }
    }

    public static boolean isSafe(int col,int row,char[][]a,int n)
    {
        //left side
        int i=row;
        for(int j=0;j<col;j++)
        {
            if(a[i][j]=='Q')
            {
                return false;
            }
        }

        //upper diagonal
        int j=col;
        for(i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(a[i][j]=='Q')
            {
                return false;
            }
        }


        //lower diagonal
        for(i=row,j=col;i<n && j>=0;i++,j--)
        {
            if(a[i][j]=='Q')
            {
                return false;
            }
        }

        return true;
    }
}
