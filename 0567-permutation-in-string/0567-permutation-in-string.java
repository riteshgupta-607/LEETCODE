class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if(s1.length() > s2.length()){
            return false;
         }

         int[] freq = new int[26];

         for(int i=0 ; i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
         }

         for(int i=0; i<s2.length(); i++){
            freq[s2.charAt(i)-'a']--;

            if( i >= s1.length()){
               freq[s2.charAt(i-s1.length())-'a']++;
            }

             boolean found = true;

             for(int count : freq){
                if(count != 0){
                    found = false;
                    break;
                }
             } 
             if(found){
                return true;
             }
         }   
        return false;
    }
}