class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int last = nums.length-1;
        int j=0;
        for(int i=0; i<n ; i++){
            if(nums[i] != 0){
               nums[j] = nums[i];
               j++;
            }
        }
        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
    }
}