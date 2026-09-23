class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = nums[i]*prefix[i-1];
        }

        suffix[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i] = nums[i]*suffix[i+1];
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int previous = 1;
            int next = 1;
            if(i-1>=0)previous = prefix[i-1];
            if(i+1<n)next = suffix[i+1];
            ans[i] = previous*next;
        }
        return ans;
    }
}  
