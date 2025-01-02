class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n=nums.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int last = -1, f = 1;
                for(int k=0; k<n; k++){
                    if(k >= i && k <= j) continue;
                    if(last >= nums[k]){ f = 0; break; }
                    last = nums[k];
                }
                if(f==1) ans++;
            }
        }
        return ans;
    }
}
