class Solution {
    List<String> ans = new ArrayList<>();
    StringBuilder path = new StringBuilder();

    String[] mapping = {"", " ","abc", "def" , "ghi","jkl","mno", "pqrs","tuv","wxyz"};
    public void combination(int idx, String digits ){
        if(idx == digits.length()){
            ans.add(path.toString());
            return;
        }
        String Letters = mapping[digits.charAt(idx)-'0'];

        for(int i=0; i<Letters.length();i++){
         path.append(Letters.charAt(i));
         combination(idx+1,digits );
         path.deleteCharAt(path.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return ans;
        }
        combination(0,digits);
        return ans;

    }
}