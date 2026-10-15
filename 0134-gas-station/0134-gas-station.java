class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int totalgas = 0;
        int totalcost =0;
        int totalbalace =0;
       for(int i =0;i<n;i++){
        totalgas += gas[i];
        totalcost += cost[i];
        totalbalace += gas[i]-cost[i];
        if(totalbalace <0){
            start = i+1;
            totalbalace =0;
        }
       }
       if(totalgas<totalcost){
        return -1;
       }
        return start;
    }
}