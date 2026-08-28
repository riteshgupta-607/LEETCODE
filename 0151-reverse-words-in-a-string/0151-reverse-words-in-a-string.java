class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for(int i=word.length-1; i>=0; i--){
            ans.append(word[i]);

            if(i != 0){
                ans.append(" ");
            }
        } 

        return ans.toString();
    }
}