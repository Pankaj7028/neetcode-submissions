class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
        List<Integer>[] bucket = new List[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(bucket[entry.getValue()] != null){
                bucket[entry.getValue()].add(entry.getKey());
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(entry.getKey());
                bucket[entry.getValue()] = temp;
            }
        }
        int ans[] = new int[k];
        for(int i=nums.length;i>0;i--){
            List<Integer> list = bucket[i];
            if(list == null ) continue;
            for(int num : list){
                ans[k-1] = num;
                k--;
                if(k==0)return ans;
            }
        }
        return ans;
    }
}
