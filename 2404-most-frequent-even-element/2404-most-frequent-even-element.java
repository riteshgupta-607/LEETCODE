class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            if(nums[i]%2 == 0){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        } 

        int ans = -1;
        int maxfreq = 0;
        for(int num : map.keySet()){
            int freq = map.get(num);
            if(freq > maxfreq || (freq == maxfreq && num < ans)){
                maxfreq = freq;
                ans = num;
            }
        }
        return ans; 
    }
}