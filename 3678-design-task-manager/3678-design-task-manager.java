class TaskManager {
    class Pair{
        int userId;
        int priority;
        Pair(int u , int p){
            userId = u;
            priority = p;
        }
    }
    class Pair2{
        int taskId;
        int priority;
        Pair2(int t , int p){
            taskId = t;
            priority = p;
        }
    }
    
    Map<Integer , Pair> map;
    TreeSet<Pair2> set;
    public TaskManager(List<List<Integer>> tasks) {
        map = new HashMap<>();
        set = new TreeSet<>((a,b) -> {
            if(a.priority != b.priority){
                return b.priority-a.priority;
            }
            else{
                return b.taskId - a.taskId;
            }
        });

        for(List<Integer> task : tasks){
            int userId = task.get(0);
            int taskId = task.get(1);
            int priority = task.get(2);

            map.put(taskId , new Pair(userId , priority));
            set.add(new Pair2(taskId , priority));
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        map.put(taskId , new Pair(userId , priority));
        set.add(new Pair2(taskId , priority));
    }
    
    public void edit(int taskId, int newPriority) {
        Pair pair = map.get(taskId);
        int oldP = pair.priority;
        int oldU = pair.userId;
        set.remove(new Pair2(taskId , oldP));
        map.put(taskId , new Pair(oldU , newPriority));
        set.add(new Pair2(taskId , newPriority));

    }
    
    public void rmv(int taskId) {
        Pair pair = map.get(taskId);
        int oldP = pair.priority;
        int oldU = pair.userId;
        set.remove(new Pair2(taskId , oldP));
        map.remove(taskId);
    }
    
    public int execTop() {
        if(set.isEmpty()) return -1;
        Pair2 pair = set.first();
        set.remove(pair);
        int userId = map.get(pair.taskId).userId;
        map.remove(pair.taskId);
        return userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */