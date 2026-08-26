class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int j = 0;
        int count = 0;
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') {
                 count++;
            }

            if(count == k){
                while(j<i && s.charAt(j) == '0'){
                    j++;
                }
                String current = s.substring(j, i+1);

                if(ans.equals("") || current.length() < ans.length() ||(current.length() == ans.length() && current.compareTo(ans) < 0)){
                    ans =  current ;
                }
                if(s.charAt(j) == '1'){
                    count--;
                    j++;
                }
            }
        }
        return ans;
    }
}