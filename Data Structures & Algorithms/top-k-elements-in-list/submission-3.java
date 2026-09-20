class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
        Queue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(),b.getValue()));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}
