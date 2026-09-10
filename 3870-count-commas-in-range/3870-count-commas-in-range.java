 class Solution {
    public int countCommas(int n) {
        int ans = 0;
        int power = 1000;
        int commas = 1;

        while (power <= n) {
            ans += (n - power + 1) * commas;

            power *= 1000;
            commas++;
        }

        return ans;
    }
}