class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        String[]arr=new String[(n+k-1)/k];
        int i=0,count=0;
        while(i+k<=n){
            arr[count++]=s.substring(i,i+k);
            i=i+k;

        }
        if(n%k!=0){
            StringBuilder sb=new StringBuilder(s.substring(i,n));
            while((n-i)<k--){
                sb.append(fill);

            }
            arr[count]=sb.toString();
        }
    
          return arr;
    }
}