 class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        for(int i=1; i<n; i += 2){
            nums[i] = pq.peek();
            pq.poll();
        }
        for(int i=0; i<n; i += 2){
            nums[i] = pq.peek();
            pq.poll();
        }
    }
}
