class Solution {
    public List<String> findItinerary(List<List<String>> tic) {
     HashMap<String,PriorityQueue<String>> map=new HashMap<>();

     for(List<String> ele:tic){
        map.computeIfAbsent(ele.get(0),k->new PriorityQueue<>()).add(ele.get(1));
     }
Deque<String> q=new ArrayDeque<>();
LinkedList<String> ans=new LinkedList<>();
q.add("JFK");
while(!q.isEmpty()){
    while(map.containsKey(q.peek())&&  !map.get(q.peek()).isEmpty()){
        q.push(map.get(q.peek()).poll());
    }
ans.addFirst(q.pop());
}
//Collections.sort(ans);
return ans;

    }
}