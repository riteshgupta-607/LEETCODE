class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
                }
                left++;
                right--;
        }
        return true;
        
    }
}