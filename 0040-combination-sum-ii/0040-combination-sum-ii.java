class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public void combination_sum(int idx, int target, int[] candidates){
        if(target == 0){
          ans.add(new ArrayList<>(path));
          return;
        }
        for(int i=idx; i<candidates.length; i++){
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if(candidates[i] > target){
                break;
            }

            path.add(candidates[i]);
            combination_sum(i+1, target-candidates[i], candidates);
            path.remove(path.size()-1);
        }
        
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combination_sum(0,target,candidates);
        return ans;
        
    }
}