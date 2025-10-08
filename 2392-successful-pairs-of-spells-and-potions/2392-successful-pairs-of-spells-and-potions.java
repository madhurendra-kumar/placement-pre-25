class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;

        int[] res=new int[n];

        Arrays.sort(potions);

        for(int i=0;i<n;i++)
        {
             int spell=spells[i];
             int count=binarySearch(spell,potions,success);
             res[i]=count;

        }

        return res;
        

    }

    public int binarySearch(int spell,int[] potions,long success)
    {
        int l=0;
        int r=potions.length-1;
        int count=0;
        while(l<=r)
        {
            int mid=l+((r-l)/2);

            if((long)potions[mid]*spell >= success)
            {
                count=potions.length-mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }

        }

        return count;
    }
}