class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int cnt[] = new int[n+1];
        cnt[0]=1;
        int res=0,a=0;
        for(int i:nums){
            a+=i&1;
            if(a-k >= 0){
                res+=cnt[a-k];
            }
            cnt[a]++;
        }
    return res;
    }
}
