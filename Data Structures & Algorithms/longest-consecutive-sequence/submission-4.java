class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        
        int maxi = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int count = 0;
            while(set.size() != 0){
                if(set.contains(num)){
                    count++;
                    set.remove(num);
                    num++;
                }
                else break;
            }
            num = nums[i]-1;
            while(set.size() != 0){
                if(set.contains(num)){
                    count++;
                    set.remove(num);
                    num--;
                }
                else break;
            }
            maxi = Math.max(maxi,count);
            if(set.size() == 0)return maxi;
        }
        return maxi;
    }
}
