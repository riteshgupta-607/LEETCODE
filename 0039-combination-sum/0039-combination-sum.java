class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public  void fxn(int idx, int   target, int[] candidates, List<Integer>path){
        if(target == 0) {
            ans.add(new ArrayList<>(path));
            return ;
        } 
        if(target<0){
            return;
        }
        for(int i = idx; i<candidates.length; i++){
            path.add(candidates[i]);
            fxn(i, target - candidates[i],candidates, path);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        fxn(0,target,candidates,new ArrayList<>() );
        return ans;
    }
}