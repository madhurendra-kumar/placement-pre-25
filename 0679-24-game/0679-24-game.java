class Solution {
    public boolean judgePoint24(int[] cards) {
        int n = cards.length;
        double[] a = new double[n];
        for(int i = 0; i < n; i++){
            a[i] = cards[i]; 
        }
        return judge(a);
    }
    private boolean judge(double[] a){
        if(a.length == 1){
            return Math.abs(a[0] - 24) < 1e-6;
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                int ind = 0;
                double[] b = new double[a.length - 1];
                for(int k = 0; k < a.length; k++){
                    if(k != i && k != j){
                        b[ind++] = a[k];
                    }
                }
                for(double l: compute(a[i], a[j])){
                    b[a.length - 2] = l;
                    if(judge(b)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private double[] compute(double i, double j){
        return new double[] {i + j, i - j, j - i, i * j, i / j, j / i};
    }
}