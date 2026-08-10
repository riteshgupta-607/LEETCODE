/// THIS QESTION CAN BE SOLVE BY USING DEQUE THAT TAKE THE TIME COMPLEXITY OF O(N)
// AND BY SOLVING WITH PRIORITY QUEUE TIME COMPLEXITY IS - O(nlogk)


class Solution {
    class pair {
        int value;
        int idx;

        pair(int value, int idx){
            this.value = value;
            this.idx = idx;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>(
        // for(int i=0; i<nums.length; i++){
            (a,b) -> b.value - a.value
        // }
        );
        int[] res = new int[nums.length-k+1];
        for(int i = 0; i < nums.length; i++) {

           pq.add(new pair(nums[i], i));

           while(pq.peek().idx < i - k + 1) {
                pq.poll();
            }
            // pq.add(new pair(nums[i], i));
            if(i >= k-1) {
            res[i-k+1] = pq.peek().value;
            }
        }
        return res;
}
}