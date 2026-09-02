class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void combination(int idx, List<Integer> path,int n, int k){
        if(path.size() == k){
            ans.add(new ArrayList<>(path));
            return;
        }
        
        for(int i = idx; i<=n; i++){
            path.add(i);
            combination(i+1,path, n,k);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        combination(1,new ArrayList<>(),n, k);
        return ans;
    }
}