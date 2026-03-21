class Solution {
    public long removeZeros(long n) {
        long ans = 0;
        long r;
        long i = 1;
        while (n > 0){
            r = n % 10;
            if(r == 0) {
                n /= 10;
                continue;
            }
            ans = i*r + ans;
            n /= 10;
            i*=10;
        }
        return ans;
    }
}