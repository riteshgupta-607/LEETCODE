class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        for(int i=0; i<n && j<n ; i++){
            if(arr[i] == 0){
                ans[j++] = 0;
                if(j<n){
                    ans[j++] = 0;
                }
            } else {
                ans[j++] = arr[i];
            }
        }
         for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
         }
      }
}