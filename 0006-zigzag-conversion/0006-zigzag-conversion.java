class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int j=0;j<numRows;j++)
        {
            sb[j]=new StringBuilder();
        }
        int n=s.length();
        int i=0;
        while(i<n)
        {
            for(int j=0;j<numRows && i<n;j++)
            {
                sb[j].append(s.substring(i,i+1));
                i++;
            }
            for(int j=numRows-2;j>=1 && i<n;j--)
            {
                sb[j].append(s.substring(i,i+1));
                i++;
            }
        }
        for(int k=1;k<sb.length;k++)
        {
            sb[0].append(sb[k]);
        }
        return sb[0].toString();
    }

}