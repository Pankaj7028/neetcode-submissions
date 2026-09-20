class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>=k)arr.add(entry.getKey());
            //System.out.println(entry.getKey()+" "+entry.getValue());
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
