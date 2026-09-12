
class Solution {

    public int vowels(String a) {
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    // public int maxVowels(String s, int k) {

    //     int max = 0;

    //     for (int i = 0; i <= s.length() - k; i++) {

    //         String str = "";

    //         for (int j = i; j < i + k; j++) {
    //             char ch = s.charAt(j);
    //             str = str + ch;
    //         }

    //         int count = vowels(str);

    //         max = Math.max(max, count);
    //     }

    //     return max;
    // }
// }

    public int maxVowels(String s, int k) {
    String first = s.substring(0, k);
     int count = vowels(first);
     int max = count;
     for(int i=k; i<s.length();i++){
        char add = s.charAt(i);
        char del = s.charAt(i-k);
        if(add =='a' || add == 'e'|| add == 'i' || add =='o'||add =='u'){
            count ++;
        }
        if(del  =='a' || del == 'e'|| del == 'i' || del =='o'||del =='u'){
            count --;
        }

        max = Math.max(max,count);

     }
     return max;

    }
}

