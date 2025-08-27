class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            boolean flag=true;
            int n=i;
            while(n>0)
            {
                int n1=n%10;
                if(n1==0 || i%n1!=0)
                {
                    flag=false;
                    break;
                }
                n=n/10;
            }
            if(flag)
            {
                l.add(i);
            }
        }
        return l;
        
    }
}