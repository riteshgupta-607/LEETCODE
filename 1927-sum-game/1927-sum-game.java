class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int Lsum =0;
        int Rsum =0;

        int Lq =0;
        int Rq = 0;

        for(int i =0; i<n;i++){
            if(num.charAt(i) == '?'){
                if(i<n/2){
                    Lq++;
                } else {
                    Rq++;
                }
            } else {
                if(i<n/2){
                    Lsum += num.charAt(i)-'0';
                } else {
                    Rsum += num.charAt(i)-'0';
                }
            }
        }
        
        int totalCount = Lq + Rq;
        if(totalCount % 2==1){
            return true;
        } 

        int left = 2*Lsum + 9*Lq;
        int right = 2*Rsum + 9*Rq;

        if(left == right){
            return false;
        } else {
            return true;
        }
    }
}