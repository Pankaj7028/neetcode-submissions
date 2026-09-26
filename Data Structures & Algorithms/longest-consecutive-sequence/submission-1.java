class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        Arrays.sort(nums);
        int maximum = 1;
        int count = 1;
        //for(int num:nums)System.out.print(num+" ");
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1] + 1){
                count++;
                maximum = Math.max(maximum, count);
            }
            else if(nums[i] == nums[i-1])continue;
            else count = 1;
        }
        return maximum;
    }
}
