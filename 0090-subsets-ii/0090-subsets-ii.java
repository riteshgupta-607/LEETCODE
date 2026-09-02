class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void subset(int idx, int [] nums,List<Integer>path ){
         ans.add(new ArrayList<>(path));
         for(int i=idx; i<nums.length; i++){
            if((i>idx) && (nums[i] == nums[i-1])){
            continue;
        }
        path.add(nums[i]);
        subset(i+1, nums,path);
        path.remove(path.size()-1);
         }
        

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(0, nums,new ArrayList<>());
        return ans;
    }
}