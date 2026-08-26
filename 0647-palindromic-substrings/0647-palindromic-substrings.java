class Solution {
    public static int expand(String s, int left, int right){
         
        int count =0;
        while(left >= 0  && right < s.length() ){
            if(s.charAt(left) == s.charAt(right) ){
                count +=1;
                left--;
                right++;
            }  else {
                break;
            }  
        }
        return count;
    }
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            count += expand(s, i, i);
            count += expand(s, i, i+1);
        }
    return count;
        
    }
}