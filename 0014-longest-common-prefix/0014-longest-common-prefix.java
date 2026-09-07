//  class Trie{
//     class TrieNode {
//         TrieNode[] children = new TrieNode[26];
//         boolean isEnd;
//     }
//     TrieNode root;
//     public Trie() {
//         root = new TrieNode();
//     }
//     public static void insert(String word){
//         TrieNode curr = root;
//         for(int i=0; i<word.length; i++){
//             int idx = word.charAt(i)-'a';
//             if(curr.children[idx] == null){
//                  curr.children[idx] = new TrieNode();
//             }
//             curr = curr.children[idx];
//         }
//         curr.isEnd = true;
//     }
//     public static 


//  }


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
          return "";
        }
        String start = strs[0];

        for(int i=0; i<start.length(); i++){
            for(int j=1; j<strs.length; j++){
               if (i >= strs[j].length() ||
                    strs[j].charAt(i) != start.charAt(i)) {

                    return start.substring(0, i);
                }
            }

        }
        return start;
    }
}