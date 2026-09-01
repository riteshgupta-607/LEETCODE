class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void fxn(int idx, int[] nums, List<Integer>path){
        if(idx == nums.length){
            ans.add(new ArrayList<>( path));
            return;
        }
        path.add(nums[idx]);
        fxn(idx+1, nums,path);
        path.remove(path.size()-1);
        fxn(idx+1,nums, path);
    }
    public List<List<Integer>> subsets(int[] nums) {
        fxn(0,nums, new ArrayList<>());
        return ans;
        
    }
}