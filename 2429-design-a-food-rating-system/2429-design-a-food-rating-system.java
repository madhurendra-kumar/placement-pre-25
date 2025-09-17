class FoodRatings {
    class Pair{
        String f;
        int r;
        Pair(String f,int r){
            this.f=f;
            this.r=r;
        }
    }
    private int n;
    private Map<String,Pair> map1;
    private Map<String,PriorityQueue<Pair>> map2;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        n=foods.length;
        map1=new HashMap<>();
        map2=new HashMap<>();
        for(int i=0;i<n;i++){
            map1.put(foods[i],new Pair(cuisines[i],ratings[i]));
            if(!map2.containsKey(cuisines[i])){
                map2.put(cuisines[i],new PriorityQueue<>((a,b)->{
                    if(a.r!=b.r) return Integer.compare(b.r,a.r);
                    else return a.f.compareTo(b.f);
                }));
            }
            map2.get(cuisines[i]).offer(new Pair(foods[i],ratings[i]));
        }
    }
    
    public void changeRating(String food, int newRating) {
        Pair p=map1.get(food);
        map1.put(food,new Pair(p.f,newRating));
        map2.get(p.f).offer(new Pair(food,newRating));
    }
    
    public String highestRated(String cuisine) {
        Pair p=map2.get(cuisine).peek();
        while(map1.get(p.f).r!=p.r){
            map2.get(cuisine).poll();
            p=map2.get(cuisine).peek();
        }
        return map2.get(cuisine).peek().f;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */