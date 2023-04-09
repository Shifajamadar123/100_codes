import java.util.Arrays;

public class fenwick {
    public static void main(String args[])
    {
        int n=11;
        int []arr = {3,2,-1,6,5,4,-3,3,7,2,3};
        int []fen = new int[n+1];
        fenwick(fen,arr);
        System.out.println(Arrays.toString(fen));
        System.out.println(query(fen,5));
        update(fen,0-arr[2],2);
        arr[2]=0;
        System.out.println(query(fen,5));
        System.out.println(Arrays.toString(fen));
        //System.out.println("Parent of 11: "+parent(11));
    }

    //parent in fenwick tree :
    //2's complement , AND it with original number , subtract from original number
    public static int parent(int i)
    {
        return i-(i&(-i));
    }

    public static int getNext(int i)
    {
        return (i)&(-i);
    }

    // u have to update the value at a[i] to all indices which will be affected
    //to get indices affected we use getNext: procedure
    // 2's complement, AND with original number , add to original number
    public static void fenwick(int []fen,int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            update(fen,a[i],i);
        }
    }

    public static void update(int []fen,int val,int i)
    {
        int index=i+1;
        while(index<fen.length)
        {
            fen[index]+=val;
            index+=getNext(index);
        }
    }

    //for query u start from h+1, add that value and keep on moving to its parents and add until it is 0
    public static int query(int []fen,int h)
    {
        int ind=h+1;
        int ans=0;
        while(ind>0)
        {
            ans += fen[ind];
            ind =parent(ind);
        }
        return ans;
    }
}
