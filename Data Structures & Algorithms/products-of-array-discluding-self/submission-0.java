class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mul =1;
        int zero =0;
        int zeroIndex = -1;
        for(int i = 0;i<n;i++) {
            if(nums[i]==0){
                zero++;
                zeroIndex = i;
            }
            else mul*=nums[i];
        }
        int ans[] = new int[n];
        if(zero>1)return ans;
        if(zero == 1){
            ans[zeroIndex] = mul;
            return ans;
        }
        for(int i=0;i<n;i++) ans[i] = mul/nums[i];
        return ans;
    }
}  
