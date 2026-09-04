class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0] , b[0]));
        List<int[]> ans = new ArrayList<>();
        for(int[] curr : intervals){
            if(ans.isEmpty() || curr[0] > ans.get(ans.size()-1)[1]){
                ans.add(new int[] {curr[0],curr[1]});
            } else {
                  ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size() -1)[1],curr[1]);
            }

        }
        return ans.toArray(new int[ans.size()][]);
    }
}